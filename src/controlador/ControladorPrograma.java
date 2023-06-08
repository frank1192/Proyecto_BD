/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import modelo.Programa;
import java.util.Vector;
import accesoDatos.*;

/**
 *
 * @author Oswaldo
 */
public class ControladorPrograma {

    DaoPrograma daoPrograma;
    
    public ControladorPrograma(){
        daoPrograma=new DaoPrograma();
    }
    
    
    public int  insertarPrograma(String  nombre, String codigo, String nivel, int numCreditos){
        Programa p = new Programa();        

        p.setCodigo(codigo);
        p.setNombre(nombre);
        p.setNivel(nivel);
        p.setCreditos(numCreditos);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result =daoPrograma.guardarPrograma(p);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }//end

    public Programa consultarPrograma(String codigo){
        
         System.out.println("Se va a consultar un programa");
         Programa p= daoPrograma.consultarPrograma(codigo);
      
       return p;
    }

    public void listarProgramas(){


    }
    
    public void cerrarConexionBD(){
        daoPrograma.cerrarConexionBD();
    }

}//fin clase
