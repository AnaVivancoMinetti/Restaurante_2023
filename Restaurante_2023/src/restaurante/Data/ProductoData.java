
package restaurante.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Producto;


public class ProductoData {
    
  private Connection connection = null;
  
  public ProductoData() {
        this.connection = Conexion.getConexion();
    }
  public void agregarProducto(Producto producto){
    
        String insertQuery = "INSERT INTO producto(id_producto, nombre_producto, precio, stock, estado) VALUES (?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement preparedStatemen = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            preparedStatemen.setInt(1, producto.getId_producto());
            preparedStatemen.setString(2, producto.getNombreProducto());
            preparedStatemen.setDouble(3, producto.getPrecio());
            preparedStatemen.setInt(4, producto.getStock());
            preparedStatemen.setBoolean(5, producto.isEstado());
            

            preparedStatemen.executeUpdate();
            
            ResultSet resultSet = preparedStatemen.getGeneratedKeys();
            if (resultSet.next()) {
                producto.setId_producto(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito.");
            }
            preparedStatemen.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
        }
    } 
 
  public void modificarProducto(Producto producto){
      String upDateQuery = "UPDATE producto SET nombre_producto = ?, precio = ?, stock = ?, estado = ? WHERE id_producto= ?";
 
      PreparedStatement preparedStatemen;
      try {
          preparedStatemen = connection.prepareStatement(upDateQuery);//, Statement.RETURN_GENERATED_KEYS);
          
          
          preparedStatemen.setString(1, producto.getNombreProducto());
            preparedStatemen.setDouble(2, producto.getPrecio());
            preparedStatemen.setInt(3, producto.getStock());
            preparedStatemen.setBoolean(4, producto.isEstado());
            preparedStatemen.setInt(5, producto.getId_producto());
           
            
             
            if (preparedStatemen.executeUpdate()!=0) {
//                producto.setId_producto(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Modificado con exito.");
            }
            preparedStatemen.close();
                 
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto: " + ex.getMessage());
      }
            
  }
  
  public void EliminarProducto (String nombre_producto){
     String upDateQuery = "UPDATE producto SET estado = 0 WHERE nombre_producto=?";
   PreparedStatement preparedStatemen;
   
      try {
          preparedStatemen = connection.prepareStatement(upDateQuery, Statement.RETURN_GENERATED_KEYS);
      preparedStatemen.setString(1,nombre_producto);
      
      int fila = preparedStatemen.executeUpdate();
       if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");

            }
            preparedStatemen.close();
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto: " + ex.getMessage());
      }
  
  
  }
  
  public List<Producto> ListarProducto() {
        List<Producto> productos = new ArrayList<>();
        try {
            String upDate = "SELECT * FROM producto WHERE estado = 1";
            PreparedStatement preparedStatemen = connection.prepareStatement(upDate);
            ResultSet resultSet = preparedStatemen.executeQuery();
            while (resultSet.next()) {
                Producto producto = new Producto();
                producto.setId_producto(resultSet.getInt("id_Producto"));
               producto.setNombreProducto(resultSet.getString("nombre_producto"));
                producto.setPrecio(resultSet.getInt("precio"));
                producto.setStock(resultSet.getInt("stock"));
                producto.setEstado(resultSet.getBoolean("estado"));
                productos.add(producto);
            }
            preparedStatemen.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto" + ex.getMessage());
        }
        return productos;

    }
public void actualizarPrecioProducto(int idProducto, double nuevoPrecio) {
        try {
            String upDate = "UPDATE producto SET precio = ? WHERE id_producto = ?;";
            
            try (PreparedStatement preparedStatemen = connection.prepareStatement(upDate)) {
                preparedStatemen.setDouble(1, nuevoPrecio);
                preparedStatemen.setInt(2, idProducto);
                
                int filasAfectadas = preparedStatemen.executeUpdate();
                
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Precio del producto actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el producto con ID: " + idProducto);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el precio del producto: " + ex.getMessage());
        }
    }
   public ArrayList<Producto> buscarProductos() {
        ArrayList<Producto> producto = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM producto WHERE id_producto = 1";
            
            try (PreparedStatement preparedStatemen = connection.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatemen.executeQuery();
                
                while (resultSet.next()) {
                    Producto productos = new Producto();
                    productos.setId_producto(resultSet.getInt("id_producto"));
                    productos.setNombreProducto(resultSet.getString("nombreProducto"));
                    productos.setPrecio(resultSet.getDouble("precio"));
                    productos.setStock(resultSet.getInt("stock"));
                    producto.add(productos);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el producto: " + ex.getMessage());
        }
        
        return producto;
    }
public Producto obtenerProducto(int id_producto) {
    
    Producto producto = new Producto();

    String selectQuery = "SELECT * FROM producto WHERE id_producto = ?";

    try {
        PreparedStatement preparedStatemen = connection.prepareStatement(selectQuery);

        preparedStatemen.setInt(1, id_producto);

        ResultSet resultSet = preparedStatemen.executeQuery();

        if (resultSet.next()) {
           producto.setId_producto(resultSet.getInt("id_producto"));
           producto.setNombreProducto(resultSet.getString("nombre_producto"));
           producto.setPrecio(resultSet.getDouble("precio"));
           producto.setStock(resultSet.getInt("stock"));
           producto.setEstado(resultSet.getBoolean("estado"));         
        } else {
            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
        }

        preparedStatemen.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el producto" + ex);
    }

    return producto;
}
 public Producto obtenerProductoPorNnombre(String nombreProducto) {
    
    Producto producto = new Producto();

    String selectQuery = "SELECT * FROM producto WHERE nombre_producto = ?";

    try {
        PreparedStatement preparedStatemen = connection.prepareStatement(selectQuery);

        preparedStatemen.setString(1, nombreProducto);

        ResultSet resultSet = preparedStatemen.executeQuery();

        if (resultSet.next()) {
           producto.setId_producto(resultSet.getInt("id_producto"));
           producto.setNombreProducto(resultSet.getString("nombre_producto"));
           producto.setPrecio(resultSet.getDouble("precio"));
           producto.setStock(resultSet.getInt("stock"));
           producto.setEstado(resultSet.getBoolean("estado"));         
        } else {
            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
        }

        preparedStatemen.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el producto" + ex);
    }

    return producto;
}
  public ArrayList<Producto> obtenerProductosNoActivos() {
        ArrayList<Producto> productoNoActivos = new ArrayList<>();

        String selectQuery = "SELECT * FROM producto WHERE estado = ?;";
        
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
            
           prepareStatement.setBoolean(1, false); // Filtra los productos no activos
            
            ResultSet resultSet = prepareStatement.executeQuery();
            
            Producto producto;
            
            while (resultSet.next()) {
                producto = new Producto();
                
                producto.setId_producto(resultSet.getInt("id_producto"));
                producto.setNombreProducto(resultSet.getString("nombre_producto"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setStock(resultSet.getInt("stock"));
                producto.setEstado(resultSet.getBoolean("estado"));
                
                productoNoActivos.add(producto);
            }
            
            prepareStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los productos no activos" + ex);
        }
        
        return productoNoActivos;
  }
  public boolean activarProducto(int id_producto) {
      
 
        boolean activado = false;

        String sql = "UPDATE producto SET estado = 1 WHERE id_producto = ?;";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id_producto);

            if (ps.executeUpdate() != 0) {
                activado = true;
            } else {
                JOptionPane.showMessageDialog(null, "El producto que intenta activar no existe");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener producto" + ex);
        }

        return activado;
    }    
     public boolean desactivarProducto(int id_producto){
        boolean desactivado = false;
        
        String selectQuery = "UPDATE producto SET estado = 0 WHERE id_producto = ?;";
        
        try{
            PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
            
            prepareStatement.setInt(1, id_producto);
            
            if(prepareStatement.executeUpdate()!=0){
                desactivado = true;
            }else{
                JOptionPane.showMessageDialog(null, "El producto que intenta desactivar no existe");
            }
            
            prepareStatement.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener producto" + ex);
        }
        
        return desactivado;
    }
  
  
  
  
  
  
  
  
  
 
}         
  


