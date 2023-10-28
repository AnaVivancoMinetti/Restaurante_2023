/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante_2023;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import restaurante.Data.Conexion;
import restaurante.Data.MesaData;
import restaurante.Data.PedidoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

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
        PedidoData pedidoData = new PedidoData();
//        Agregar mesas**********************************
//        Mesa mesa1 = new Mesa(1, true, 4);
//        Mesa mesa2 = new Mesa(2, false, 2);
//        mesaData.agregarMesa(mesa2);
        
        //++++++++++++++buscarMesaPorId-----------
//        
//        Mesa mesaEncontrada = mesaData.buscarMesaPorId(1);
//        System.out.println(mesaEncontrada);
//        
//        //PEDIDOS*********************************
//        Pedido pedido1 = new Pedido(mesaEncontrada, "Fulano", LocalDate.of(2023,10,10), 3000, false);
          
//        pedidoData.agregarPedido(pedido1);
//        
//        pedidoData.buscarPedidoPorID(1);
//        System.out.println("Pedido encontrado:" + pedidoData.buscarPedidoPorID(1));
//Mesa mesaX = new Mesa(6, true, 2);
//mesaData.agregarMesa(mesaX);

////**************************************CREO PEDIDO Y DESPUÉS LO MODIFICO
//Mesa mesaY = new Mesa(7, false, 2);
//mesaData.agregarMesa(mesaY);
//Mesa mesita1 = new Mesa(9, false, 4);
//mesaData.agregarMesa(mesita1);
//        System.out.println("Mesa: ");
//        System.out.println(mesita1);
//Pedido pedido3= new Pedido(mesita1, "Lorena", LocalDate.of(2023,11,11), 10000, false, LocalTime.of(19, 55));
//pedidoData.agregarPedido(pedido3);
////        System.out.println("Mesa: " + mesaY);
//        System.out.println("Pedido: " + pedido3);
//        
//pedido3.setImporte(7000);
Pedido pedido = pedidoData.buscarPedidoPorID(4);
//pedido.setNombre_mesero("Fulano");
//pedidoData.modificarPedido(pedido);
//
//Pedido pedidoEncontrado = pedidoData.buscarPedidoPorID(3);
//        System.out.println("PEDIDO ENCONTRADO: " + pedidoEncontrado);
//
//    pedidoData.reactivarPedido(pedidoData.buscarPedidoPorID(6));
    pedidoData.reactivarPedido(pedido);
    
//*******************************************COBRO PRODUCTO Y DESPUÉS LO "REACTIVO"
    //pedidoData.cobrarPedido(pedidoData.buscarPedidoPorID(2));
    //pedidoData.reactivarPedido(pedidoData.buscarPedidoPorID(2));
    
    
    
    
//***************************************************************ACÁ QUERÍA PROBAR LAS LISTAS    
    /*
    ArrayList<Pedido>pedidosxmesa = pedidoData.buscarPedidoPorMesa(1);
        System.out.println("Pedidos mesa 1");
    for(Pedido pedido : pedidosxmesa){
        System.out.println("Pedido: " + pedido.toString());
    }
    
        System.out.println("**************************\nPedidos 27/10/23: ");
    for (Pedido pedido : pedidoData.buscarPedidoPorFecha(LocalDate.of(2023, 10, 27))){
        
        System.out.println("Pedido: " + pedido.toString());
    }
    
        System.out.println("***********************\nPedidos cobrados: ");
    for(Pedido pedido : pedidoData.pedidosCobrados()){
        System.out.println( "Pedido: " + pedido.toString());
    }
    
        System.out.println("********************\nPedido sin cobrar: ");
    for(Pedido pedido : pedidoData.pedidosSinCobrar()){
        System.out.println("Pedido: " + pedido.toString());        
    }
            
    */
    }
}
