/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

import java.time.LocalDate;

/**
 *
 * @author MaRio
 */
public class Pedido {
    
    private int id_pedido;
    private Mesa mesa;
    private String nombre_mesero;
    private LocalDate fecha_hora;
    private double importe;
    private boolean cobrada;

    public Pedido() {
    }
    
    

    public Pedido(int id_pedido, Mesa mesa, String nombre_mesero, LocalDate fecha_hora, double importe, boolean cobrada) {
        this.id_pedido = id_pedido;
        this.mesa = mesa;
        this.nombre_mesero = nombre_mesero;
        this.fecha_hora = fecha_hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public Pedido(Mesa mesa, String nombre_mesero, LocalDate fecha_hora, double importe, boolean cobrada) {
        this.mesa = mesa;
        this.nombre_mesero = nombre_mesero;
        this.fecha_hora = fecha_hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombre_mesero() {
        return nombre_mesero;
    }

    public void setNombre_mesero(String nombre_mesero) {
        this.nombre_mesero = nombre_mesero;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", mesa=" + mesa + ", nombre_mesero=" + nombre_mesero + ", fecha_hora=" + fecha_hora + ", importe=" + importe + ", cobrada=" + cobrada + '}';
    }
    
    
    
    
    
}
