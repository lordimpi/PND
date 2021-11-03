package co.panaderia.access;

import co.panaderia.domain.entitys.Empleado;
import co.panaderia.infra.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
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
public class EmpleadoRepository implements IEmpleadoRepository {

    private Connection conn;

    @Override
    public boolean create(Empleado newEmpleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado findByEmail(String email) {
        Empleado empleado = null;
        try {
            String sql = "{CALL BuscarEmpleadoPorEmail(?)}";
            this.connect();
            CallableStatement cstmt = conn.prepareCall(sql);
            cstmt.setString(1, email);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                empleado = new Empleado();
                empleado.setId(rs.getInt("Id"));
                empleado.setDocumento(rs.getString("Documento"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setApellido(rs.getString("Apellidos"));
                empleado.setCorreo(rs.getString("Correo"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setPassword(rs.getString("Clave"));
                empleado.setCargo(rs.getString("Cargo"));
                empleado.setRol(rs.getString("Rol"));
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoRepository.class.getName()).log(Level.SEVERE, "Error al buscar el empleado en la base de datos", ex);
        }
        return empleado;
    }

    @Override
    public List<Empleado> list() {
        List<Empleado> empleados = new ArrayList<>();
        try {

            String sql = "{CALL ListarEmpleados}";
            this.connect();

            CallableStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Empleado newEmpleado = new Empleado();
                newEmpleado.setId(Integer.parseInt(rs.getString("Id")));
                newEmpleado.setDocumento(rs.getString("Documento"));
                newEmpleado.setNombre(rs.getString("Nombre"));
                newEmpleado.setApellido(rs.getString("Apellidos"));
                newEmpleado.setCorreo(rs.getString("Correo"));
                newEmpleado.setTelefono(rs.getString("Telefono"));
                newEmpleado.setPassword(rs.getString("Clave"));
                newEmpleado.setCargo(rs.getString("Cargo"));
                newEmpleado.setRol(rs.getString("Rol"));

                empleados.add(newEmpleado);
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleados;
    }

    /**
     * Conectar a la bd
     *
     * @return 1 si fue posible conectar, -1 de lo contrario
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
            Logger.getLogger(EmpleadoRepository.class.getName()).log(Level.SEVERE, "Error al consultar Personas de la base de datos", ex);
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
            Logger.getLogger(EmpleadoRepository.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }
    }

}
