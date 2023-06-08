package accesoDatos;

import java.util.List;

import modelo.ModeloIniciarSesion;

public interface InterfaceIniciarSesionDAO {
    List<ModeloIniciarSesion> administrador();
    ModeloIniciarSesion getAdministrador(String nombre);
    void save(ModeloIniciarSesion usuario);
    void uptade(ModeloIniciarSesion usuario);
    void delete(ModeloIniciarSesion usuario);
}
