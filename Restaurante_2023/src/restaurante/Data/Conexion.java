/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MaRio
 */
public class Conexion {
     private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="restaurante";
    private static final String USUARIO="root";
    private static String PASSWORD="";
    private static Connection connection;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        if(connection==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB+"?useLegacyDatetimecode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASSWORD);
                System.out.println("Conexion a la base de datos exitosa");
            }catch(SQLException ex){
                   System.out.println("Error al conectarse a la BD"+ex.getMessage());
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers"+ex.getMessage());
            }
        }
        return connection;
    }
}
