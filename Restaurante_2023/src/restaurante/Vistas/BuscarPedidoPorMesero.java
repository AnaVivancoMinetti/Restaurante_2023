package restaurante.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.Data.PedidoData;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;

public class BuscarPedidoPorMesero extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private PedidoData pedidoData = new PedidoData();

    public BuscarPedidoPorMesero() {
        initComponents();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jtfMesero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jdcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaPropertyChange(evt);
            }
        });

        jtfMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfMeseroKeyReleased(evt);
            }
        });

        jLabel1.setText("Mesero");

        jLabel2.setText("Fecha");

        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPedidos);

        jLabel3.setText("Buscar pedidos cobrados");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbBuscar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2))
                            .addComponent(jdcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

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

    private void jdcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaPropertyChange

    }//GEN-LAST:event_jdcFechaPropertyChange

    private void jtfMeseroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMeseroKeyReleased
//
//        if (jdcFecha == null) {
//            JOptionPane.showMessageDialog(null, "Primero debe seleccionar una fecha");
//        } else {
//            vaciarTabla();
//            LocalDate fecha = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            ArrayList<Pedido> pedidos = pedidoData.buscarPedidoPorFecha(fecha);
//            for (Pedido pedido : pedidos) {
//                if (pedido.getNombre_mesero().startsWith(jtfMesero.getText())) {
//                    modelo.addRow(new Object[]{
//                        pedido.getId_pedido(),
//                        pedido.getMesa().getNumero(),
//                        pedido.getNombre_mesero(),
//                        pedido.getFecha(),
//                        pedido.getImporte(),
//                        pedido.getHora()
//                    });
//                }
//            }
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMeseroKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        llenarTabla();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtPedidos;
    private javax.swing.JTextField jtfMesero;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Importe");
        modelo.addColumn("Hora");
        jtPedidos.setModel(modelo);
    }

    private void llenarTabla() {
        vaciarTabla();
        
        if (jdcFecha == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha");
        } else if (jtfMesero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba un nombre");
        } else {
            LocalDate fecha = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ArrayList<Pedido> pedidos = pedidoData.buscarPedidoPorFecha(fecha);
            System.out.println("TAMAÑO LISTA: " + pedidos.size());
            for (Pedido pedido : pedidos) {
                System.out.println("DB: " + pedido.getNombre_mesero());
                System.out.println("Ingresado: " + jtfMesero.getText());
                if (pedido.getNombre_mesero().equalsIgnoreCase(jtfMesero.getText()) && pedido.isCobrada()==true) {
                System.out.println("entramos");
                //if (pedido.getNombre_mesero().startsWith(jtfMesero.getText())) {
                    modelo.addRow(new Object[]{
                        pedido.getId_pedido(),
                        pedido.getMesa().getNumero(),
                        pedido.getNombre_mesero(),
                        pedido.getFecha(),
                        pedido.getImporte(),
                        pedido.getHora()}
                    );
                }
            }
        }
    }

    private void vaciarTabla() {
        modelo.setRowCount(0);
    }

}
