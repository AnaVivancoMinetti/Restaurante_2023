
package restaurante.Vistas;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Data.MesaData;
import restaurante.Data.PedidoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

/**
 *
 * @author User
 */
public class ModificarPedido extends javax.swing.JInternalFrame {

    PedidoData pedidoData = new PedidoData();
    MesaData mesaData = new MesaData();
    
    public ModificarPedido() {
        initComponents();        
        cargarComboPedido();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMesero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jtfHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jrbCobrado = new javax.swing.JRadioButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbPedidos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jtfImporte = new javax.swing.JTextField();

        jLabel1.setText("Modificar Pedido");

        jLabel3.setText("Mesero");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora");

        jtfHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfHora.setText("hh:mm");

        jLabel6.setText("Cobrado");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("PEDIDO NRO");

        jcbPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPedidosActionPerformed(evt);
            }
        });

        jLabel8.setText("Importe $");

        jtfImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)
                                .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7))
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19)
                                .addComponent(jrbCobrado))
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EscritorioLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jbModificar))
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EscritorioLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel4))
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addComponent(jrbCobrado)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSalir)
                            .addComponent(jbModificar))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(this, "Desea aplicar las modificaciones al pedido?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            Pedido pedido = (Pedido)jcbPedidos.getSelectedItem();

            pedido.setNombre_mesero(jtfMesero.getText());
            pedido.setFecha(jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            pedido.setImporte(Double.parseDouble(jtfImporte.getText()));
            pedido.setCobrada(jrbCobrado.isSelected());
            pedido.setHora(obtenerHora().toLocalTime());

            JOptionPane.showMessageDialog(null, "Modificando...");
            
            pedidoData.modificarPedido(pedido);
            
            vaciarCampos();

             } else {
            JOptionPane.showMessageDialog(null, "Cancelando modificación...");
        }
            
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfImporteActionPerformed

    private void jcbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPedidosActionPerformed
        mostrarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Pedido> jcbPedidos;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbCobrado;
    private javax.swing.JTextField jtfHora;
    private javax.swing.JTextField jtfImporte;
    private javax.swing.JTextField jtfMesero;
    // End of variables declaration//GEN-END:variables


private void cargarComboPedido(){
    ArrayList<Pedido> pedidos = pedidoData.pedidosTodos();
    for(Pedido pedido : pedidos){
        jcbPedidos.addItem(pedido);
    }
}
    
private void vaciarCampos(){
        jtfMesero.setText("");
        jtfHora.setText("");
        jtfImporte.setText("");
        jrbCobrado.setSelected(false);
        jdcFecha.setDate(null);
    }

private Time obtenerHora() {

        String horaTF;
        Time hora = null;
        if (jtfHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la hora");
        } else {
            horaTF = jtfHora.getText();
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                java.util.Date parsedDate = dateFormat.parse(horaTF);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(parsedDate);
                calendar.set(Calendar.SECOND, 0);
                hora = new Time(calendar.getTimeInMillis());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener horario, intente nuevamente" + ex.getMessage());
            }
        }
        return hora;
    }

private void mostrarDatos(){
    Pedido pedido = (Pedido)jcbPedidos.getSelectedItem(); 
    jtfMesero.setText(pedido.getNombre_mesero());
    jdcFecha.setDate(Date.valueOf(pedido.getFecha()));
    jtfImporte.setText(pedido.getImporte()+"");
    jtfHora.setText(pedido.getHora()+"");
    jrbCobrado.setSelected(pedido.isCobrada());
    
}

}
