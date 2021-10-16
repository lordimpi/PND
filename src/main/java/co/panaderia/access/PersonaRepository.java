/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.panaderia.access;

import co.panaderia.domain.entitys.Persona;
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
 *
 * @author Santiago Acuña
 */
public class PersonaRepository implements IPersonaRepository {
    
    private Connection conn;
    
    @Override
    public boolean create(Persona newPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean update(Persona newPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Persona find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Persona> list() {
        List<Persona> personas = new ArrayList<>();
        try {
            
            String sql = "{CALL ListarPersonas}";
            this.connect();
            
            CallableStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Persona newPersona = new Persona();
                newPersona.setId(Integer.parseInt(rs.getString("per_id")));
                newPersona.setDocumento(rs.getString("per_documento"));
                newPersona.setNombre(rs.getString("per_nombre"));
                newPersona.setApellido(rs.getString("per_apellidos"));
                newPersona.setCorreo(rs.getString("per_correo"));
                newPersona.setTelefono(rs.getString("per_telefono"));
                
                personas.add(newPersona);
            }
            this.disconnect();
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personas;
    }

    /**
     * Conectar a la bd
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
