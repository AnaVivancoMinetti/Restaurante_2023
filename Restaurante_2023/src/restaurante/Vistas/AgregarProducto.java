
package restaurante.Vistas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        
        
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
       
        try{
            String nombreproducto = jTextFieldNombre.getText().trim(); // Obtiene el nombre del producto ingresado en el campo de texto y elimina espacios en blanco al principio y al final. // Obtiene el nombre del producto ingresado en el campo de texto.
validarCampo(nombreproducto);
validarCampoPrecio(jTextFieldPrecio.getText());
double precio = Double.parseDouble(jTextFieldPrecio.getText()); // Obtiene el precio ingresado en el campo de texto y lo convierte a un valor decimal.
int stock = (int) jSpinnerStock.getValue(); // Obtiene la cantidad de stock seleccionada en el spinner.
boolean estado = jRadioButtonEstado.isSelected(); // Obtiene el estado de la casilla de verificación (activo o inactivo).

Producto producto = new Producto(nombreproducto, precio, stock, estado);
// Crea un objeto "Producto" con los valores obtenidos. Este objeto representa el nuevo producto que se va a agregar.

productoData.agregarProducto(producto);

// Llama al método "agregarProducto" de la clase "ProductoData" para agregar el producto a la base de datos.
// El resultado (éxito o fracaso) se almacena en la variable "insertado".
        }catch(NumberFormatException e){
            System.out.println("No se admiten numeros"); 
        }
      limpiarCampos();  
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

public void validarCampo(String text){

    if(text.isEmpty()){
         JOptionPane.showMessageDialog(null, "No se admiten campos vaciaos");
    }
    if(contieneSoloNumeros(text)){
         JOptionPane.showMessageDialog(null, "No se admiten campos CON NUMEROS");
    }
   
}
public static boolean contieneSoloNumeros(String text) {
        Pattern pattern = Pattern.compile("[0-9]+");// Valida que solo sean numeros (expresiones regulares)
        Matcher matcher = pattern.matcher(text); // Compara el texto con lo que le pasamos de patron.

        return matcher.matches(); // retorna verdadero si el patron que le pasamos arriba se cumple con el texto.
    }
public void validarCampoPrecio(String text) {
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se admiten campos vacíos");
        } else if (contieneSoloNumeros(text)) {
//            JOptionPane.showMessageDialog(null, "No se admiten campos Letras");
        }else if(!contieneSoloNumeros(text)){
            JOptionPane.showMessageDialog(null, "No se admiten campos Letras");
        }
    }







}
