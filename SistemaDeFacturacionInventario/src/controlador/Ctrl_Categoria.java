package controlador;

import Conexion.Conexion;
import com.mysql.jdbc.ResultSetInternalMethods;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import modelo.Categoria;
import java.sql.DriverManager;
import java.sql.ResultSet;



/**
 *
 * @author Carlos
 */
public class Ctrl_Categoria {

    
    // Metodo para registrar categoria
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();

        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values (?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();

        } catch (java.sql.SQLException e) {
            System.out.println("Error al guardar");
        }
        
        return respuesta;

    }
    
     public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_categoria where descripcion = '"+ categoria +"';";
        Statement st; 
        

        

        try {
            
           Connection cn = Conexion.conectar();
           st = (Statement) cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while (rs.next()){
               respuesta = true;
           }
           

        } catch (java.sql.SQLException e) {
            System.out.println("Error al consultar");
        }
        
        return respuesta;

    }

}
