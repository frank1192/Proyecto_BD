/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accesoDatos;

/**
 *
 * @author Oswaldo
 */
import java.sql.*;
public class FachadaBD {
        String url, usuario, password;
        Connection conexion =null;   
        
        FachadaBD(){
            url="jdbc:postgresql://localhost:5432/tablas_y_registros";
            usuario="postgres";
            password="$PGadmin$";
        }
        
        

        public Connection openConnection(){
            try {
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            //System.out.println( "Driver Cargado" );
            } catch( ClassNotFoundException e ) {
                System.out.println( "No se pudo cargar el driver." );
            }

            try{
                     //Crear el objeto de conexion a la base de datos
                     conexion = DriverManager.getConnection(url, usuario, password);
                     System.out.println( "Conexion Exitosa con la Base de datos" );
                     return conexion;
                  //Crear objeto Statement para realizar queries a la base de datos
             } catch( SQLException e ) {
                System.out.println( "No se pudo abrir la bd." );
                return null;
             }

        }//end connectar

        public Connection getConnetion(){
            if (conexion == null) {
                return this.openConnection();
            }
            else{
                  return conexion;      
            }
            
        }
        
        public void closeConection(Connection c){
            try{
                if (conexion != null){
                    c.close();
                }
                 
            } catch( SQLException e ) {
                System.out.println( "No se pudo cerrar." );
            }
        }
        
        /*
        public static void main(String a[]){
            FachadaBD fachada = new FachadaBD();
            Connection c = fachada.openConnection();
           fachada.closeConection(c);
        }*/
        
        
}//end class