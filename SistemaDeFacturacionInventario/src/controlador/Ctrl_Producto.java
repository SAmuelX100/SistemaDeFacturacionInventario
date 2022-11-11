package controlador;

import Conexion.Conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Producto;
import java.sql.ResultSet;


/**
 *
 * @author Carlos
 */
public class Ctrl_Producto {
    
       public boolean guardar(Producto objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();

        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_producto values (?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeItbis());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (java.sql.SQLException e) {
            System.out.println("Error al guardar producto");
        }

        return respuesta;

    }

    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select nombre from tb_producto where descripcion = '" + producto + "';";
        Statement st;

        try {

            Connection cn = Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (java.sql.SQLException e) {
            System.out.println("Error al consultar producto");
        }

        return respuesta;

    }   

    // Metodo paara actualizar productos
    
    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();

        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_producto set nombre=?, cantidad=?, precio=?, descripcion=?, porcentajeItbis=?, idCategoria=?, estado=? where idProducto = '" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeItbis());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (java.sql.SQLException e) {
            System.out.println("Error al actualizar" + e);
        }

        return respuesta;

    }
    
    // Metodo para eliminar categoria
    public boolean eliminar (int idProducto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();

        try {

            PreparedStatement consulta = cn.prepareStatement(" delete from tb_producto where idProducto = '"+ idProducto + "'");
            consulta.executeUpdate();
           

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (java.sql.SQLException e) {
            System.out.println("Error al eliminar");
        }

        return respuesta;

    }
    //metodo para actualizar Stock del producto
    public boolean actualizarStock(Producto object, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_producto set cantidad=? where idProducto ='" + idProducto + "'");
            consulta.setInt(1, object.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Error al actualizar stock del Producto: " + e);
        }
        return respuesta;
    }
    
}
