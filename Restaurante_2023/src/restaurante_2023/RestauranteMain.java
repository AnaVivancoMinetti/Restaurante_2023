/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante_2023;

import restaurante.Data.Conexion;
import restaurante.Data.MesaData;
import restaurante.Entidades.Mesa;

/**
 *
 * @author MaRio
 */
public class RestauranteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MesaData mesaData = new MesaData();
        
//        Mesa mesa1 = new Mesa(1, true, 4);
//        Mesa mesa2 = new Mesa(2, false, 2);
//        mesaData.agregarMesa(mesa2);
        
        //++++++++++++++buscarMesaPorId-----------
        
        Mesa mesaEncontrada = mesaData.buscarMesaPorId(1);
        System.out.println(mesaEncontrada);
    }
    
}
