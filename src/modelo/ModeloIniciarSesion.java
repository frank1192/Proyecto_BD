
package modelo;

/**
 *
 * @author Franklin Aguirre
 */
public class ModeloIniciarSesion {
     private String Usuario;
    private String Contraseña;

    public ModeloIniciarSesion(String usuario, String contraseña){
        this.Usuario = usuario;
        this.Contraseña = contraseña;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
