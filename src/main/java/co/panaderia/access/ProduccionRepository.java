package co.panaderia.access;

import co.panaderia.domain.entitys.Produccion;
import co.panaderia.domain.entitys.Producto;
import co.panaderia.infra.Utilities;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Acuña
 */
public class ProduccionRepository implements IProduccionRepository {

    private Connection conn;

    @Override
    public boolean create(Produccion newProduccion) {
        try {
            String sql = "{CALL AgregarProduccion(?,?,?)}";
            this.connect();
            CallableStatement cstmt = conn.prepareCall(sql);

            cstmt.setInt(1, newProduccion.getProducto().getId());
            cstmt.setInt(2, newProduccion.getCantidad());
            cstmt.setDate(3, newProduccion.getFecha());

            ResultSet rs = cstmt.executeQuery();
            this.disconnect();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, "Error al crear el producto {0}", ex);
        }
        return false;
    }

    @Override
    public Produccion find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Produccion produccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produccion> list() {
        List<Produccion> producciones = new ArrayList<>();
        try {
            String sql = "{CALL ListarProduccion}";
            this.connect();
            CallableStatement cstmt = conn.prepareCall(sql);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                Produccion newProduccion = new Produccion();
                newProduccion.setProducto(new Producto());
                newProduccion.setId(rs.getInt("Id"));
                newProduccion.setFecha(rs.getDate("Fecha"));
                newProduccion.setCantidad(rs.getInt("Cantidad"));
                newProduccion.getProducto().setNombre(rs.getString("Nombre"));
                newProduccion.getProducto().setDescripcion(rs.getString("Descripcion"));
                newProduccion.getProducto().setPrecioVenta(rs.getDouble("PrecioVenta"));
                newProduccion.getProducto().setImagen(rs.getBytes("Imagen"));

                producciones.add(newProduccion);
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producciones;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Conectar a la bd
     *
     * @return Estado de la conexión
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            String username = Utilities.loadProperty("server.db.username");
            String pwd = Utilities.loadProperty("server.db.password");
            conn = DriverManager.getConnection(url, username, pwd);
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, "Error al consultar Productos de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Desconecta de la base de datos
     */
    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }
    }
}
