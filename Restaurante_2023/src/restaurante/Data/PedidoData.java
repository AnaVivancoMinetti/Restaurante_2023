package restaurante.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

public class PedidoData {

    private Connection connection = null;

    //NO SÉ SI ESTARÁ BIEN
    MesaData mesaData = new MesaData();

    public PedidoData() {
        this.connection = Conexion.getConexion();
    }

    public void agregarPedido(Pedido pedido) {

        String insertQuery = "INSERT INTO pedido (id_pedido, id_mesa, nombre_mesero, fecha, importe, cobrada, hora) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, pedido.getId_pedido());
            preparedStatement.setInt(2, pedido.getMesa().getIdMesa());//***********************get ID o get NUM??
            preparedStatement.setString(3, pedido.getNombre_mesero());
            preparedStatement.setDate(4, Date.valueOf(pedido.getFecha()));
            //alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            //ps.setDate(4, Date.valueOf(pedido.getFecha()));
            preparedStatement.setDouble(5, pedido.getImporte());
            preparedStatement.setBoolean(6, pedido.isCobrada());
            preparedStatement.setTime(7, Time.valueOf(pedido.getHora()));

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                pedido.setId_pedido(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido añadido con exito.");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el pedido. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }
    }

    public void actualizarImporte(double subtotal, Pedido pedido){
        String updateQuery = "UPDATE pedido SET importe = ? WHERE id_pedido = ?";
        int idPedido = pedido.getId_pedido();
        double importe = pedido.getImporte();
        double total = importe + subtotal;
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setDouble(1, total);
            preparedStatement.setInt(2, idPedido);
            
              if (preparedStatement.executeUpdate() != 0) {
                  System.out.println( "Pedido modificado");
            } else {
                
                 System.out.println( "No existe el pedido/no se pudooo");
            }
            preparedStatement.close();
            
        } catch (SQLException ex) {

             System.out.println( "No se pudo actualizar el importe. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }
        
        
    }
    
    public void modificarPedido(Pedido pedido) {
        System.out.println("Entro a modificar");
        String updateQuery = "UPDATE pedido SET nombre_mesero = ?, fecha = ?, cobrada = ?, hora = ? WHERE id_pedido = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setString(1, pedido.getNombre_mesero());
            preparedStatement.setDate(2, Date.valueOf(pedido.getFecha()));
            preparedStatement.setBoolean(3, pedido.isCobrada());
            preparedStatement.setTime(4, Time.valueOf(pedido.getHora()));
            preparedStatement.setInt(5, pedido.getId_pedido());

            if (preparedStatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Pedido modificado");
            } else {

                JOptionPane.showMessageDialog(null, "No existe el pedido/no se pudooo");
            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el pedido. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

    }

    public Pedido buscarPedidoPorID(int idPedido) {
        Pedido pedido = null;
        String selectQuery = "SELECT id_mesa, nombre_mesero, fecha, importe, cobrada, hora FROM pedido WHERE id_pedido  = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, idPedido);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id_mesa = resultSet.getInt("id_mesa");
                Mesa mesa = mesaData.buscarMesaPorId(id_mesa);

                pedido = new Pedido();
                pedido.setId_pedido(idPedido);
                pedido.setMesa(mesa);
                pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                pedido.setImporte(resultSet.getDouble("importe"));
                pedido.setCobrada(resultSet.getBoolean("cobrada"));
                pedido.setHora(resultSet.getTime("hora").toLocalTime());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró pedido con ese ID");
            }
            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el pedido. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedido;
    }

    public void cobrarPedido(Pedido pedido) {
        try {
            int idPedido = pedido.getId_pedido();
            String updateQuery = "UPDATE pedido SET cobrada = 1 WHERE id_pedido = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, idPedido);

            if (preparedStatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Pedido cobrado");
            }

            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo cobrar el pedido. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

    }

    public void reactivarPedido(Pedido pedido) {
        try {
            int idPedido = pedido.getId_pedido();
            String updateQuery = "UPDATE pedido SET cobrada = 0 WHERE id_pedido = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, idPedido);

            if (preparedStatement.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Pedido reactivado");
            }

            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo cobrar el pedido. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

    }

    public ArrayList<Pedido> buscarPedidoPorMesero(String nombre_mesero) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = null;
        String selectQuery = "SELECT * FROM pedido WHERE nombre_mesero = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, nombre_mesero);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "No se encontraron pedidos del mesero/no existe el mesero");
            } else {
                while (resultSet.next()) {
                    Mesa mesa = mesaData.buscarMesaPorId(resultSet.getInt("id_mesa"));

                    pedido = new Pedido();
                    pedido.setId_pedido(resultSet.getInt("id_pedido"));
                    pedido.setMesa(mesa);
                    pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                    pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                    pedido.setImporte(resultSet.getDouble("importe"));
                    pedido.setCobrada(resultSet.getBoolean("cobrada"));
                    pedido.setHora(resultSet.getTime("hora").toLocalTime());

                    pedidos.add(pedido);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los pedidos del mesero. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedidos;
    }

    public ArrayList<Pedido> buscarPedidoPorMesa(int idMesa) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = null;
        String selectQuery = "SELECT * FROM pedido WHERE id_mesa  = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, idMesa);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Mesa mesa = mesaData.buscarMesaPorId(idMesa);

                pedido = new Pedido();
                pedido.setId_pedido(resultSet.getInt("id_pedido"));
                pedido.setMesa(mesa);
                pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                pedido.setImporte(resultSet.getDouble("importe"));
                pedido.setCobrada(resultSet.getBoolean("cobrada"));
                pedido.setHora(resultSet.getTime("hora").toLocalTime());

                pedidos.add(pedido);

            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los pedidos de la mesa. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedidos;
    }

    public ArrayList<Pedido> buscarPedidoPorFecha(LocalDate fecha) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = null;
        String selectQuery = "SELECT * FROM pedido WHERE fecha  = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setDate(1, Date.valueOf(fecha));
            //alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            //ps.setDate(4, Date.valueOf(pedido.getFecha()));
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Mesa mesa = mesaData.buscarMesaPorId(resultSet.getInt("id_mesa"));

                pedido = new Pedido();
                pedido.setId_pedido(resultSet.getInt("id_pedido"));
                pedido.setMesa(mesa);
                pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                pedido.setImporte(resultSet.getDouble("importe"));
                pedido.setCobrada(resultSet.getBoolean("cobrada"));
                pedido.setHora(resultSet.getTime("hora").toLocalTime());

                pedidos.add(pedido);

            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los pedidos de la fecha. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedidos;
    }

    public ArrayList<Pedido> pedidosSinCobrar() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = null;
        String selectQuery = "SELECT * FROM pedido WHERE cobrada  = 0";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Mesa mesa = mesaData.buscarMesaPorId(resultSet.getInt("id_mesa"));

                pedido = new Pedido();
                pedido.setId_pedido(resultSet.getInt("id_pedido"));
                pedido.setMesa(mesa);
                pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                pedido.setImporte(resultSet.getDouble("importe"));
                pedido.setCobrada(resultSet.getBoolean("cobrada"));
                pedido.setHora(resultSet.getTime("hora").toLocalTime());

                pedidos.add(pedido);

            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener pedidos sin cobrar. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedidos;
    }

    public ArrayList<Pedido> pedidosCobrados() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = null;
        String selectQuery = "SELECT * FROM pedido WHERE cobrada  = 1";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Mesa mesa = mesaData.buscarMesaPorId(resultSet.getInt("id_mesa"));

                pedido = new Pedido();
                pedido.setId_pedido(resultSet.getInt("id_pedido"));
                pedido.setMesa(mesa);
                pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                pedido.setImporte(resultSet.getDouble("importe"));
                pedido.setCobrada(resultSet.getBoolean("cobrada"));
                pedido.setHora(resultSet.getTime("hora").toLocalTime());

                pedidos.add(pedido);
            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener pedidos cobrados. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedidos;
    }

    public ArrayList<Pedido> pedidosTodos() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = null;
        String selectQuery = "SELECT * FROM pedido";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Mesa mesa = mesaData.buscarMesaPorId(resultSet.getInt("id_mesa"));

                pedido = new Pedido();
                pedido.setId_pedido(resultSet.getInt("id_pedido"));
                pedido.setMesa(mesa);
                pedido.setNombre_mesero(resultSet.getString("nombre_mesero"));
                pedido.setFecha(resultSet.getDate("fecha").toLocalDate());
                pedido.setImporte(resultSet.getDouble("importe"));
                pedido.setCobrada(resultSet.getBoolean("cobrada"));
                pedido.setHora(resultSet.getTime("hora").toLocalTime());

                pedidos.add(pedido);
            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener pedidos cobrados. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }

        return pedidos;
    }

    //ESTE NO SERVIRÍA
    public void eliminarPedidoDefinitivamente(Pedido pedido) {
        int id = pedido.getId_pedido();
        String deleteQuery = "DELETE FROM pedido WHERE id_pedido = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, id);
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido eliminado");
            }

            preparedStatement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el pedido. Error al acceder a la tabla Pedidos: " + ex.getMessage());
        }
    }

}
