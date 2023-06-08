/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import java.util.ArrayList;
import java.util.List;
import modelo.ModeloIniciarSesion;
/**
 *
 * @author Franklin Aguirre
 */
public class IniciarSesion_DAO  implements InterfaceIniciarSesionDAO{
    
    private  List<ModeloIniciarSesion> administradores;

    public IniciarSesion_DAO(){
        administradores = new ArrayList<ModeloIniciarSesion>();


        //Adiministradores
        administradores.add(new ModeloIniciarSesion("Juan Cifuentes", "2179800"));
        administradores.add(new ModeloIniciarSesion("Franklin", "1841743"));
        administradores.add(new ModeloIniciarSesion("Wilson Andres", "2182116"));
        administradores.add(new ModeloIniciarSesion("Jhon Riascos", "2024464"));
    }

    @Override
    public List<ModeloIniciarSesion> administrador() {
        return administradores;
    }

    @Override
    public ModeloIniciarSesion getAdministrador(String nombre) {
        for(ModeloIniciarSesion usuario: administradores){
            if(usuario.getUsuario().equals(nombre)){
                return usuario;
            }
        }

        return null;
    }

    @Override
    public void save(ModeloIniciarSesion usuario) {
        administradores.add(usuario);
    }

    @Override
    public void uptade(ModeloIniciarSesion usuario) {
        for(ModeloIniciarSesion iniciarSesion : administradores){
            if(iniciarSesion.getUsuario().equals(usuario.getUsuario())){
                usuario.setContraseña(usuario.getContraseña());;
            }
        }
    }

    @Override
    public void delete(ModeloIniciarSesion usuario) {
        administradores.remove(usuario);
    }
    
}
