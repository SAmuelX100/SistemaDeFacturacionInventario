package controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Ezequiel R
 */
public class Ctrl_Usuario {

    //metodo para iniciar sesion
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        
        Connection cn = Conexion.conectar();
        String sql = "select  usuario, password from tb_usuario where usuario = '" + objeto.getUsuario() + "' and password ='" + objeto.getPassword() + "'";
        Statement st;
        try {
            
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al inicial sesion");
            JOptionPane.showMessageDialog(null, "Error al inicial sesion");
        }
        return respuesta;
    }
}
