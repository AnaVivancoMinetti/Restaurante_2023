
package restaurante.Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Mesa> listarMesaDesocupadas() {
        List<Mesa> mesas = new ArrayList<>();
        try {
            String selectQuery = "SELECT * FROM mesa WHERE estado_mesa=0";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Mesa mesa = new Mesa(
                        resultSet.getInt("id_mesa"),
                        resultSet.getInt("numero_mesa"),
                        resultSet.getBoolean("estado_mesa"), 
                        resultSet.getInt("capacidad"));
                
                
                mesas.add(mesa);
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());
        }
        return mesas;
    }
    
    public List<Mesa> listarMesaOcupadas() {
        List<Mesa> mesas = new ArrayList<>();
        try {
            String selectQuery = "SELECT * FROM mesa WHERE estado_mesa=1";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Mesa mesa = new Mesa(
                        resultSet.getInt("id_mesa"),
                        resultSet.getInt("numero_mesa"),
                        resultSet.getBoolean("estado_mesa"), 
                        resultSet.getInt("capacidad"));

                mesas.add(mesa);
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());
        }
        return mesas;
    }
    
    
    public void eliminarMesaPorId(int idMesa){
        
        try {
            String upDateQuery = "UPDATE mesa SET estado_mesa = 0 WHERE id_mesa = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(upDateQuery);
            preparedStatement.setInt(1, idMesa);
            int seModifico = preparedStatement.executeUpdate();
            if (seModifico >= 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el Mesa.");
            }else{
                JOptionPane.showMessageDialog(null, "Mesa no existe");
            }
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa: "+e.getMessage());
        }
    }
    
}
    

