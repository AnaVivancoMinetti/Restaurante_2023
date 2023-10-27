
package restaurante.Data;

import java.sql.*;

import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;

public class MesaData {
    
    private Connection connection = null;

    public MesaData() {
        this.connection = Conexion.getConexion();
    }
    
    public void agregarMesa(Mesa mesa){
    
        String insertQuery = "INSERT INTO mesa (id_mesa, numero_mesa, estado_mesa, capacidad) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatemen = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            preparedStatemen.setInt(1, mesa.getIdMesa());
            preparedStatemen.setInt(2, mesa.getNumero());
            preparedStatemen.setBoolean(3, mesa.isEstado_mesa());
            preparedStatemen.setInt(4, mesa.getCapacidad());

            preparedStatemen.executeUpdate();
            
            ResultSet resultSet = preparedStatemen.getGeneratedKeys();
            if (resultSet.next()) {
                mesa.setIdMesa(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa añadido con exito.");
            }
            preparedStatemen.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa: " + ex.getMessage());
        }
    } 
    public Mesa buscarMesaPorId(int idMesa){
        
        Mesa mesa = null;
        String selectQuery = "SELECT numero_mesa, estado_mesa, capacidad FROM mesa WHERE id_mesa = ? AND estado_mesa = 1";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, idMesa);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                mesa = new Mesa(idMesa,
                          resultSet.getInt("numero_mesa"),
                        resultSet.getBoolean("estado_mesa"), 
                        resultSet.getInt("capacidad"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la mesa");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + ex.getMessage());
        }
        return mesa;
    
    }
    
    
    
}
    

