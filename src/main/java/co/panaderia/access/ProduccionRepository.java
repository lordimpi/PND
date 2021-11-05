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
    public Produccion buscar(int id) {
        Produccion produccion = null;
        try {
            String sql = "{CALL BuscarProduccion(?)}";
            this.connect();
            CallableStatement cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, id);
            ResultSet rs = cstmt.executeQuery();

            if (rs.next()) {
                produccion = new Produccion();
                produccion.setId(rs.getInt("prod_id"));
                produccion.setCantidad(rs.getInt("prod_cantidad"));
                produccion.setFecha(rs.getDate("prod_fecha"));
                produccion.getProducto().setId(rs.getInt("pr_id"));
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produccion;
    }

    @Override
    public boolean update(Produccion produccion) {
        try {
            String sql = "{CALL ModificarProduccion(?,?,?,?)}";
            this.connect();
            CallableStatement cstmt = conn.prepareCall(sql);

            cstmt.setInt(1, produccion.getId());
            cstmt.setInt(2, produccion.getCantidad());
            cstmt.setDate(3, produccion.getFecha());
            cstmt.setInt(4, produccion.getProducto().getId());

            cstmt.executeQuery();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
        try {
            String sql = "{CALL EliminarProduccion(?)}";
            this.connect();
            CallableStatement cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, id);
            cstmt.executeQuery();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, "Error al eliminar la produccion", ex);
        }
        return false;
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
            Logger.getLogger(ProduccionRepository.class.getName()).log(Level.SEVERE, "Error al consultar la Produccion en la base de datos", ex);
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
