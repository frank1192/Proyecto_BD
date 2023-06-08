/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accesoDatos;

/**
 *
 * @author Oswaldo
 */
import modelo.Programa;
import java.sql.*;
/**
 *
 * @author oswaldo
 */
public class DaoPrograma {
    FachadaBD fachada;
    Connection conn;
    public DaoPrograma(){
        fachada= new FachadaBD();
        conn= fachada.getConnetion();
    }

    public int guardarPrograma(Programa p){
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO programa VALUES ('" +
                p.getCodigo() + "', '" + p.getNombre() +  "', '" +
                p.getNivel() + "', " + p.getCreditos() + ")";
        try{
            
            Statement sentencia = this.conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public Programa consultarPrograma(String codigo){
        Programa p= new Programa();
        String sql_select;
        sql_select="SELECT codigo, nombre,nivel, creditos FROM  programa WHERE codigo='" + codigo +  "'";
         try{
            
            System.out.println("consultando en la bd");
            Statement sentencia = this.conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
               p.setCodigo(tabla.getString(1));              
               p.setNombre(tabla.getString(2));               
               p.setNivel(tabla.getString(3));              
               p.setCreditos(tabla.getInt(4));
              
              //System.out.println("ok");
            }
           
            return p;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return null;
    }

    public void modificarPrograma( int codigoPrograma){

    }
    
    public void listarProgramas(){
        
    }
    public void borrarPrograma(int codigoPrograma){
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }


}//fin clase



