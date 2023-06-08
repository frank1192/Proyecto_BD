
package modelo;

import Vistas.VistaIniciarSesion;
import accesoDatos.IniciarSesion_DAO;
import accesoDatos.InterfaceIniciarSesionDAO;
import controlador.ControladorIniciarSesion;



public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VistaIniciarSesion view = new VistaIniciarSesion ();
        
        ModeloIniciarSesion model = new ModeloIniciarSesion("Usuario", "Contraseña");
        InterfaceIniciarSesionDAO daoAministrador = new IniciarSesion_DAO();
        ControladorIniciarSesion ctrl = new ControladorIniciarSesion (view,model, daoAministrador);

        ctrl.iniciar();

        view.setVisible(true);

    }
    
}
    

