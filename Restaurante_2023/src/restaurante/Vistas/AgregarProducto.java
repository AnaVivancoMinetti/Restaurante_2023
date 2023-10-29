
package restaurante.Vistas;

import javax.swing.JOptionPane;
import restaurante.Data.ProductoData;
import restaurante.Entidades.Producto;


public class AgregarProducto extends javax.swing.JInternalFrame {

    private ProductoData productoData; 
    
    public AgregarProducto() {
        initComponents();
        productoData = new ProductoData(); // Asegúrate de que la conexión a la base de datos esté configurada en ProductoData


        // Crear una instancia de ProductoData pasando la conexión
        productoData = new ProductoData();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerStock = new javax.swing.JSpinner();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("AGREGAR PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 10));

        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 100, 50, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, -1));

        jLabel3.setText("PRECIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 60, -1));

        jButtonAgregar.setText("AGREGAR");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel4.setText("STOCK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(jSpinnerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jRadioButtonEstado.setText("ACTIVO");
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("$");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 20, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/Imagenes/IMAGEN FONDO.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
       String nombreproducto = jTextFieldNombre.getText(); // Obtiene el nombre del producto ingresado en el campo de texto.

double precio = Double.parseDouble(jTextFieldPrecio.getText()); // Obtiene el precio ingresado en el campo de texto y lo convierte a un valor decimal.
int stock = (int) jSpinnerStock.getValue(); // Obtiene la cantidad de stock seleccionada en el spinner.
boolean estado = jRadioButtonEstado.isSelected(); // Obtiene el estado de la casilla de verificación (activo o inactivo).

Producto producto = new Producto(nombreproducto, precio, stock, estado);
// Crea un objeto "Producto" con los valores obtenidos. Este objeto representa el nuevo producto que se va a agregar.

productoData.agregarProducto(producto);
// Llama al método "agregarProducto" de la clase "ProductoData" para agregar el producto a la base de datos.
// El resultado (éxito o fracaso) se almacena en la variable "insertado".
  
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
      dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables


private void limpiarCampos(){
    jTextFieldNombre.setText(" ");
        jTextFieldPrecio.setText(" ");
        jSpinnerStock.setValue((Integer)0);
        jRadioButtonEstado.setSelected(false);
}


}
// public boolean existeProducto(Producto producto){
//        boolean existe = false;
//        
//        String selectQuery = "SELECT * FROM producto WHERE nombre_producto = ?;";
//        
//        try{
//            PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
//            
//            prepareStatement.setString(1, producto.getNombreProducto());
//            
//            ResultSet resultSet = prepareStatement.executeQuery();
//            
//            if(resultSet.next() && producto.getNombreProducto().equalsIgnoreCase(resultSet.getString("nombre_producto"))){
//                existe = true;
//            }
//            
//            prepareStatement.close();
//            
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "Error al comparar productos" + ex);
//        }
//        
//        return existe;
//    }
//  public boolean agregarProducto(Producto producto){
//    if (existeProducto(producto)) {
//        JOptionPane.showMessageDialog(null, "El producto ingresado ya existe");
//        return false; // Producto ya existe, no se debe continuar con la inserción.
//    }
//    boolean insert = true;
//        String insertQuery = "INSERT INTO producto(id_producto, nombre_producto, precio, stock, estado) VALUES (?, ?, ?, ?, ?);";
//        
//        try {
//            PreparedStatement preparedStatemen = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
//            preparedStatemen.setInt(1, producto.getId_producto());
//            preparedStatemen.setString(2, producto.getNombreProducto());
//            preparedStatemen.setDouble(3, producto.getPrecio());
//            preparedStatemen.setInt(4, producto.getStock());
//            preparedStatemen.setBoolean(5, producto.isEstado());
//            
//
//            preparedStatemen.executeUpdate();
//            
//            ResultSet resultSet = preparedStatemen.getGeneratedKeys();
//            if (resultSet.next()) {
//            producto.setId_producto(resultSet.getInt(1));
//        } else {
//            insert = false;
//        }
//        preparedStatemen.close();
//    } catch (SQLException ex) {
//        insert = false;
//        JOptionPane.showMessageDialog(null, "Error al cargar el producto" + ex);
//    }
//
//    return insert;
//}
// 
//  public boolean modificarProducto(Producto producto){
//      boolean update = false;
//      String upDateQuery = "UPDATE producto SET nombre_producto = ?, precio = ?, stock = ?, estado = ? WHERE id_producto= ?;";
// 
//      PreparedStatement preparedStatemen;
//      try {
//          preparedStatemen = connection.prepareStatement(upDateQuery);//, Statement.RETURN_GENERATED_KEYS);
//          
//          
//          preparedStatemen.setString(1, producto.getNombreProducto());
//            preparedStatemen.setDouble(2, producto.getPrecio());
//            preparedStatemen.setInt(3, producto.getStock());
//            preparedStatemen.setBoolean(4, producto.isEstado());
//            preparedStatemen.setInt(5, producto.getId_producto());
//           
//            
//             
//            if (preparedStatemen.executeUpdate()!=0) {
//                update = true;
//                JOptionPane.showMessageDialog(null, "Producto Modificado con exito.");
//            }
//            preparedStatemen.close();
//                 
//      } catch (SQLException ex) {
//          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto: " + ex.getMessage());
//      }
//     
//      return false;
//            
//  }
//
//  
//  public boolean EliminarProducto (int id_producto){
//       boolean delete = false;
//     String upDateQuery = "UPDATE producto SET estado = 1 WHERE id_producto=?";
//   PreparedStatement preparedStatemen;
//   
//      try {
//          preparedStatemen = connection.prepareStatement(upDateQuery, Statement.RETURN_GENERATED_KEYS);
//      preparedStatemen.setInt(1,id_producto);
//      
//     if( preparedStatemen.executeUpdate()!=0){
//                delete = true;
//            }else{
//                JOptionPane.showMessageDialog(null, "El producto que intenta eliminar no existe");
//            }
//            
//            preparedStatemen.close();
//                      
//        }catch(SQLException ex){
//            if(ex instanceof java.sql.SQLIntegrityConstraintViolationException){
//                JOptionPane.showMessageDialog(null,"Error al eliminar. El producto es empleado por otras areas");
//            }else{
//                JOptionPane.showMessageDialog(null,"Error al eliminar el producto" + ex);
//            }
//        }
//        
//        return delete;
//    }
//public Producto obtenerProductoPorNnombre(String nombreProducto) {
//    
//    Producto producto = new Producto();
//
//    String selectQuery = "SELECT * FROM producto WHERE nombre_producto = ?";
//
//    try {
//        PreparedStatement preparedStatemen = connection.prepareStatement(selectQuery);
//
//        preparedStatemen.setString(1, nombreProducto);
//
//        ResultSet resultSet = preparedStatemen.executeQuery();
//
//        if (resultSet.next()) {
//           producto.setId_producto(resultSet.getInt("id_producto"));
//           producto.setNombreProducto(resultSet.getString("nombre_producto"));
//           producto.setPrecio(resultSet.getDouble("precio"));
//           producto.setStock(resultSet.getInt("stock"));
//           producto.setEstado(resultSet.getBoolean("estado"));         
//        } else {
//            JOptionPane.showMessageDialog(null, "El producto ingresado no existe");
//        }
//
//        preparedStatemen.close();
//
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al obtener el producto" + ex);
//    }
//
//    return producto;
//}
//  
//}