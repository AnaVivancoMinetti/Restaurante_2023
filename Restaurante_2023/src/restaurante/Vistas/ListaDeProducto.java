
package restaurante.Vistas;

import javax.swing.table.DefaultTableModel;
import restaurante.Data.ProductoData;
import restaurante.Entidades.Producto;


public class ListaDeProducto extends javax.swing.JInternalFrame {
private DefaultTableModel model = new DefaultTableModel();
   private ProductoData productoData;
    public ListaDeProducto() {
        initComponents();
        productoData = new ProductoData(); // Asegúrate de que la conexión a la base de datos esté configurada en ProductoData


        // Crear una instancia de ProductoData pasando la conexión
        productoData = new ProductoData();
        model = (DefaultTableModel) jTable.getModel();
    
        armarCabecera();
       clearTable();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jrbProductosActivos = new javax.swing.JRadioButton();
        jrbProductosNoActivos = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("LISTA DE PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 30));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 110));

        buttonGroup1.add(jrbProductosActivos);
        jrbProductosActivos.setText("VerActivas");
        jrbProductosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbProductosActivosActionPerformed(evt);
            }
        });
        jPanel1.add(jrbProductosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        buttonGroup1.add(jrbProductosNoActivos);
        jrbProductosNoActivos.setText("VerInactivas");
        jrbProductosNoActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbProductosNoActivosActionPerformed(evt);
            }
        });
        jPanel1.add(jrbProductosNoActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/Imagenes/IMAGEN FONDO.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbProductosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbProductosActivosActionPerformed
        
        if (jrbProductosActivos.isSelected()) {
            mostrarProductoActivo();
           
       }

    }//GEN-LAST:event_jrbProductosActivosActionPerformed

    private void jrbProductosNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbProductosNoActivosActionPerformed
     
        if (jrbProductosNoActivos.isSelected()) {
           mostrarProductoNoActivo();
      
    }
  
    }//GEN-LAST:event_jrbProductosNoActivosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JRadioButton jrbProductosActivos;
    private javax.swing.JRadioButton jrbProductosNoActivos;
    // End of variables declaration//GEN-END:variables


   private void clearTable(){
    int i = jTable.getRowCount()-1;
    for(;i>=0;i--){
        model.removeRow(i);
    }
   }
    private void limpiarCampos(){
  
        jrbProductosActivos.setText("f ");
        jrbProductosNoActivos.setText(" ");
}


    private void armarCabecera() {
        model.addColumn("id_producto");
    model.addColumn("nombre");
    model.addColumn("Stock");
    model.addColumn("Precio");
    model.addColumn("estado");
        jTable.setModel(model);
        
    }
     
    private void mostrarProductoActivo(){

model.setRowCount(0); // Limpia la tabla antes de agregar nuevas filas
        for (Producto producto : productoData.ListarProducto()) {
            model.addRow(new Object[]{
                producto.getId_producto(),
                producto.getNombreProducto(),
                producto.getStock(),
                producto.getPrecio(),
                    producto.isEstado(),
            });
            
            
        }  

}
 private void mostrarProductoNoActivo(){
     
     model.setRowCount(0); // Limpia la tabla antes de agregar nuevas filas
        for (Producto producto : productoData.obtenerProductosNoActivos()) {
            
            model.addRow(new Object[]{
                producto.getId_producto(),
                producto.getNombreProducto(),
                producto.getStock(),
                producto.getPrecio(),
                producto.isEstado()
                    
            });
             
        }   
    
 }
  


    
 
}




