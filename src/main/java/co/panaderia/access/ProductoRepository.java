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
 * Es una implementación que tiene libertad de hacer una implementación del
 * contrato. Lo puede hacer con Sqlite, postgres, mysql, u otra tecnología
 *
 * @author Santiago Acuña
 */
public class ProductoRepository implements IProductoRepository {

    /**
     * Variable para realizar la connexión a la base de datos
     */
    private Connection conn;

    /**
     * Metodo encargado de obtener una lista de productos en la base de datos
     *
     * @return Devuelve una lista de productos
     */
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
                newProducto.setImagen(rs.getBytes("pr_imagen"));
                
                productos.add(newProducto);
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;

    }

    /**
     * Buscar un producto en la base de datos mediante un identificador
     *
     * @param id Idenficador para realizar la busqueda
     * @return Devuelve un objeto de tipo producto
     */
    @Override
    public Producto buscar(int id) {
        Producto producto = null;
        try {
            this.connect();
            String sql = "{CALL BuscarProducto(?)}";
            CallableStatement stmt = conn.prepareCall(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                producto.setId(rs.getInt("pr_id"));
                producto.setNombre(rs.getString("pr_nombre"));
                producto.setDescripcion(rs.getString("pr_descripcion"));
                producto.setPrecioVenta(rs.getDouble("pr_precioVenta"));
                producto.setImagen(rs.getBytes("pr_imagen"));
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, "Error al buscar el producto en la base de datos", ex);
        }
        return producto;
    }

    /**
     * Crea un producto en la base de datos
     *
     * @param nuevoProducto Producto a guadar en la base de datos
     * @return True si puedo crear, false de lo contrario
     */
    @Override
    public boolean crear(Producto nuevoProducto) {
        try {
            String sql = "{CALL InsertarProducto(?, ?, ?, ?)}";
            this.connect();
            CallableStatement cstm = conn.prepareCall(sql);

            cstm.setString(1, nuevoProducto.getNombre());
            cstm.setString(2, nuevoProducto.getDescripcion());
            cstm.setDouble(3, nuevoProducto.getPrecioVenta());
            cstm.setBytes(4, nuevoProducto.getImagen());

            cstm.executeQuery();
            this.disconnect();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, "Error al crear el producto {0}", ex);
        }
        return false;
    }

    /**
     * Modifica un producto en la base de datos
     *
     * @param productoModificado Producto que sera modificado en la base de
     * datos
     * @return True si pudo modificar, false de lo contrario
     */
    @Override
    public boolean actualizar(Producto productoModificado) {
        try {
            String sql = "{CALL EditarProducto(?, ?, ?, ?, ?)}";
            this.connect();
            CallableStatement cstm = conn.prepareCall(sql);

            cstm.setInt(1, productoModificado.getId());
            cstm.setString(2, productoModificado.getNombre());
            cstm.setString(3, productoModificado.getDescripcion());
            cstm.setDouble(4, productoModificado.getPrecioVenta());
            cstm.setBytes(5, productoModificado.getImagen());
            cstm.executeQuery();

            this.disconnect();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, "Error al actualizar el producto ", ex);
        }
        return false;
    }

    /**
     * Eliminar un producto de la base de datos
     *
     * @param id Identificadro para eliminar un producto
     * @return True si pudo eliminar, false de lo contrario
     */
    @Override
    public boolean eliminar(int id) {
        try {
            String sql = "{CALL EliminarProducto(?)}";
            this.connect();
            CallableStatement cstm = conn.prepareCall(sql);

            cstm.setInt(1, id);
            cstm.execute();

            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, "Error al eliminar producto ", ex);
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
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, "Error al consultar Productos de la base de datos", ex);
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
            Logger.getLogger(ProductoRepository.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }
    }
}
