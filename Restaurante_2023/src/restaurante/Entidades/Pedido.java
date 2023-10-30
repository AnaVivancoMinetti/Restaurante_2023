/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MaRio
 */
public class Pedido {
    
    private int id_pedido;
    private Mesa mesa;
    private String nombre_mesero;
    private LocalDate fecha;
    private double importe;
    private boolean cobrada;
    private LocalTime hora;

    public Pedido() {
    }

    public Pedido(int id_pedido, Mesa mesa, String nombre_mesero) {
        this.id_pedido = id_pedido;
        this.mesa = mesa;
        this.nombre_mesero = nombre_mesero;
    }
    
    

    public Pedido(int id_pedido, Mesa mesa, String nombre_mesero, LocalDate fecha, double importe, boolean cobrada, LocalTime hora) {
        this.id_pedido = id_pedido;
        this.mesa = mesa;
        this.nombre_mesero = nombre_mesero;
        this.fecha = fecha;
        this.importe = importe;
        this.cobrada = cobrada;
        this.hora = hora;
    }

    public Pedido(Mesa mesa, String nombre_mesero, LocalDate fecha, double importe, boolean cobrada, LocalTime hora) {
        this.mesa = mesa;
        this.nombre_mesero = nombre_mesero;
        this.fecha = fecha;
        this.importe = importe;
        this.cobrada = cobrada;
        this.hora = hora;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    
    
    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", mesa=" + mesa + ", nombre_mesero=" + nombre_mesero + ", fecha=" + fecha + ", importe=" + importe + ", cobrada=" + cobrada + ", hora=" + hora + '}';
    }
    
    
    
    
    
}
