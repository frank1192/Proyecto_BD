/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accesoDatos;

/**
 *
 * @author Oswaldo
 */
import modelo.Estudiante;
import java.sql.*;
/**
 *
 * @author oswaldo
 */
public class DaoEstudiante {
    FachadaBD fachada;

    DaoEstudiante(){
        fachada= new FachadaBD();
    }//

     public int guardarEstudiante(Estudiante est){
        String sql_guardar;
        sql_guardar="INSERT INTO estudiante(codigo, nombre, sexo, codigo_programa) VALUES ('" +
                est.getCodigo() + "', '" + est.getNombre() +  "', '" +
                  est.getSexo() + "', '"  +
                 est.getPrograma().getCodigo() + "')";
        try{
            Connection conn= fachada.openConnection();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return -1;
    }//fin guardar

    public void consultarEstudiantes(){
        
        String sql_select;
        sql_select="SELECT codigo, nombre, codigo_programa FROM estudiante";
         try{
            Connection conn= fachada.openConnection();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("Codigo\tNombre\tPrograma");
            //
            while(tabla.next()){
               System.out.println("Codigo: " + tabla.getString(1) + " Nombre: " + tabla.getString(2) + " Plan:" +  tabla.getString(3));

            }
            conn.close();
             System.out.println("Conexion cerrada");

         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }

}// Fin Clase
