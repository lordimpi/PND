package co.panaderia.access;

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
public class ProductoRepository implements IProductoRepository {

    /**
     * Variable para realizar la connexión a la base de datos
     */
    private Connection conn;

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        try {

            String sql = "{CALL ListarProductos}";
            this.connect();

            CallableStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Producto newProducto = new Producto();
                newProducto.setId(Integer.parseInt(rs.getString("pr_id")));
                newProducto.setNombre(rs.getString("pr_nombre"));
                newProducto.setDescripcion(rs.getString("pr_descripcion"));
                newProducto.setPrecioVenta(rs.getDouble("pr_precioVenta"));

                productos.add(newProducto);
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;

    }

    @Override
    public boolean crear(Producto nuevoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Producto productoModificado) {
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
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, "Error al consultar Personas de la base de datos", ex);
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
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }
    }

}
