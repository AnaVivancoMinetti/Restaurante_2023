
package restaurante.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.PedidoProducto;
import restaurante.Entidades.Producto;

public class PedidoProductoData {
    
    private Connection connection = null;

    PedidoProductoData pedidoProductoData = new PedidoProductoData();
     PedidoProducto pedidoProducto = new PedidoProducto();
    
     
     public PedidoProductoData() {
        this.connection = Conexion.getConexion();
    }
     public void agregarPedidoProducto(PedidoProducto pedidoProducto) {
        String insertQuery = "INSERT INTO pedido_producto (id_pedido, id_producto, cantidad, subtotal) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setInt(1, pedidoProducto.getPedido().getId_pedido());
            preparedStatement.setInt(2, pedidoProducto.getProducto().getId_producto());
            preparedStatement.setInt(3, pedidoProducto.getCantidad());
            preparedStatement.setDouble(4, pedidoProducto.getSubtotal());

            int exito = preparedStatement.executeUpdate();
            
            if(exito == 1){
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                pedidoProducto.setId_pedido_producto(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle añadido con exito.");                
            }
            }
            
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        }
    }

    public void modificarPedidoProducto(PedidoProducto pedidoProducto) {
        String updateQuery = "UPDATE pedido_producto SET id_pedido = ?, id_producto = ?, cantidad = ? WHERE id_pedido_producto = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, pedidoProducto.getPedido().getId_pedido());
            preparedStatement.setInt(2, pedidoProducto.getProducto().getId_producto());
            preparedStatement.setInt(3, pedidoProducto.getCantidad());
            preparedStatement.setInt(4, pedidoProducto.getId_pedido_producto());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Manejar la excepción apropiadamente
        }
    }

    public void eliminarPedidoProducto(int idPedidoProducto) {
        String deleteQuery = "DELETE FROM pedido_producto WHERE id_pedido_producto = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, idPedidoProducto);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    public PedidoProducto buscarPedidoProductoPorID(int idPedidoProducto) {
    PedidoProducto pedidoProducto = null;
    String selectQuery = "SELECT id_pedido, id_producto, cantidad FROM pedido_producto WHERE id_pedido_producto = ?";

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        preparedStatement.setInt(1, idPedidoProducto);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int idPedido = resultSet.getInt("id_pedido");
            int idProducto = resultSet.getInt("id_producto");
            int cantidad = resultSet.getInt("cantidad");

//            Pedido pedido = pedidoData.buscarPedidoPorID(idPedido); // Utiliza el método de búsqueda de PedidoData
//            Producto producto = productoData.buscarProductoPorID(idProducto); // Utiliza el método de búsqueda de ProductoData

//            pedidoProducto = new PedidoProducto(idPedidoProducto, pedido, producto, cantidad);
        }

        preparedStatement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        
    }

    return pedidoProducto;
}

   public List<PedidoProducto> listarPedidoProductos() {
    List<PedidoProducto> listaPedidoProductos = new ArrayList<>();
    String selectQuery = "SELECT id_pedido_producto, id_pedido, id_producto, cantidad FROM pedido_producto";

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int idPedidoProducto = resultSet.getInt("id_pedido_producto");
            int idPedido = resultSet.getInt("id_pedido");
            int idProducto = resultSet.getInt("id_producto");
            int cantidad = resultSet.getInt("cantidad");

//            Pedido pedido = pedidoData.buscarPedidoPorID(idPedido); 
//            Producto producto = productoData.buscarProductoPorID(idProducto); 
//
//            PedidoProducto pedidoProducto = new PedidoProducto(idPedidoProducto, pedido, producto, cantidad);
            listaPedidoProductos.add(pedidoProducto);
        }

        preparedStatement.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Manejar la excepción apropiadamente
    }

    return listaPedidoProductos;
}
}
