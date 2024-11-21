/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logic;

import model.beans.Usuario;
import modelo.dao.UsuarioDAO;

/**
 *
 * @author Belphegor
 */
public class UserLogic {
    private static UsuarioDAO usuariodao=new UsuarioDAO();
    public static boolean autentificar(String Usuario, String contraseña) {
        Usuario usuario= obtener(Usuario);{
        
        
        if (usuario == null) {
            return false;
        }
        
        if (usuario.getUsuario().equals(usuario) && usuario.getContraseña().equals(contraseña)) {
            return true;
        } else {
            return false;
        }
    }
}
    
    public static boolean insertar(Usuario usuario){
        return usuariodao.insertar(usuario);
        
    }
    
    public static boolean modificar(Usuario usuario){
        return usuariodao.modificar(usuario);
        
    }
    
    public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario);
        
    }
    
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario);
        
    }
}


