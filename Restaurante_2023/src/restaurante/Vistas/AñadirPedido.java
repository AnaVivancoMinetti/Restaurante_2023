
package restaurante.Vistas;

import java.awt.event.KeyEvent;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Data.MesaData;
import restaurante.Data.PedidoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

public class AñadirPedido extends javax.swing.JInternalFrame {

    PedidoData pedidoData = new PedidoData();
    MesaData mesaData = new MesaData();
    
    public AñadirPedido() {
        initComponents();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboMesa = new javax.swing.JComboBox<>();
        jtfMesero = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jtfHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbAñadir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setText("Añadir Pedido");

        jComboMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMesaActionPerformed(evt);
            }
        });

        jtfMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMeseroActionPerformed(evt);
            }
        });
        jtfMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfMeseroKeyReleased(evt);
            }
        });

        jtfHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfHora.setText("hh:mm");
        jtfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHoraActionPerformed(evt);
            }
        });
        jtfHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfHoraKeyReleased(evt);
            }
        });

        jLabel2.setText("Mesa");

        jLabel3.setText("Mesero");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora");

        jbAñadir.setText("Añadir");
        jbAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(jbAñadir)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbAñadir))
                .addGap(35, 35, 35))
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

    private void jComboMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboMesaActionPerformed

    private void jbAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirActionPerformed
    
        Pedido pedido = new Pedido();
        Mesa mesa = (Mesa)jComboMesa.getSelectedItem();
        
        pedido.setMesa(mesa);
        pedido.setNombre_mesero(jtfMesero.getText());
        pedido.setFecha(jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        pedido.setHora(obtenerHora().toLocalTime());
        pedido.setImporte(0.0);
        
        
        
        pedidoData.agregarPedido(pedido);
        
        vaciarCampos();
                
    }//GEN-LAST:event_jbAñadirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHoraActionPerformed

    private void jtfMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMeseroActionPerformed

    private void jtfMeseroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMeseroKeyReleased

        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_LEFT) && !(evt.getKeyChar() == KeyEvent.VK_RIGHT)) {
    evt.consume();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMeseroKeyReleased

    private void jtfHoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfHoraKeyReleased

        if (!(Character.isDigit(evt.getKeyChar())) && !(evt.getKeyChar() == ':') && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_LEFT) && !(evt.getKeyChar() == KeyEvent.VK_RIGHT)) {
            evt.consume();
        }

    }//GEN-LAST:event_jtfHoraKeyReleased


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio;
    private javax.swing.JComboBox<Mesa> jComboMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAñadir;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField jtfHora;
    private javax.swing.JTextField jtfMesero;
    // End of variables declaration//GEN-END:variables
    
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
    
    private void vaciarCampos(){
        jtfMesero.setText("");
        jtfHora.setText("");
        jdcFecha.setDate(null);
    }
    
    private void cargarCombo(){
        List<Mesa> mesas = mesaData.listarTodasLasMesas();
        for(Mesa mesa : mesas){
            jComboMesa.addItem(mesa);
        }
    }
    
    
    
}
