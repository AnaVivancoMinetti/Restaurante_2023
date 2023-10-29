
package restaurante.Vistas;


import javax.swing.JOptionPane;
import restaurante.Data.ProductoData;
import restaurante.Entidades.Producto;

public class ModificarProducto extends javax.swing.JInternalFrame {

    private ProductoData productoData; 
    
    public ModificarProducto() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBscarId = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerStock = new javax.swing.JSpinner();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MODIFICAR PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel2.setText("BUSCAR POR ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(jTextFieldBscarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 90, -1));

        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 110, -1));

        jLabel4.setText("PRECIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("$");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 20, 20));

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 60, -1));

        jLabel6.setText("STOCK");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel1.add(jSpinnerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jRadioButtonEstado.setText("ACTIVO");
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModificarMouseClicked(evt);
            }
        });
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/Imagenes/IMAGEN FONDO.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 500, 390));

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

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
      int id = Integer.parseInt(jTextFieldBscarId.getText());
    String nombreProducto = jTextFieldNombre.getText();
    double precio = Double.parseDouble(jTextFieldPrecio.getText()); // Obtiene el precio ingresado en el campo de texto y lo convierte a un valor decimal.
int stock = (int) jSpinnerStock.getValue(); // Obtiene la cantidad de stock seleccionada en el spinner.
boolean estado = jRadioButtonEstado.isSelected(); // Obtiene el estado de la casilla de verificación (activo o inactivo).
    
   Producto producto = new Producto(id,nombreProducto, precio, stock, estado);
   
   productoData.modificarProducto(producto);
//if (producto != null) {
        // Actualiza los datos del producto con las modificaciones
//        producto.setPrecio(precio);
//        producto.setStock(stock);
//        producto.setEstado(estado);
//   if (productoData.modificarProducto(producto)) {
//            JOptionPane.showMessageDialog(this, "Los cambios se modificaron exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
//
////             Deshabilita la edición de campos
//            jTextFieldNombre.setEnabled(false);
//        jTextFieldPrecio.setEnabled(false);
//        jSpinnerStock.setEnabled(false);
//        jRadioButtonEstado.setEnabled(false);

//} else {
//            JOptionPane.showMessageDialog(this, "Error al modificar los cambios.", "Error", JOptionPane.ERROR_MESSAGE);
  // }
//    } else {
//        JOptionPane.showMessageDialog(this, "El producto no se encontró en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
//    
//
//
//            }
//limpiarCampos();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String id_Producto = jTextFieldBscarId.getText();
        
        int idProducto = Integer.parseInt(id_Producto);
        Producto producto = productoData.obtenerProducto(idProducto);
        
        jTextFieldNombre.setText(producto.getNombreProducto());
        jTextFieldPrecio.setText(producto.getPrecio()+ " ");
        jSpinnerStock.setValue((Integer)producto.getStock());
        jRadioButtonEstado.setSelected(producto.isEstado());
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTextField jTextFieldBscarId;
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
