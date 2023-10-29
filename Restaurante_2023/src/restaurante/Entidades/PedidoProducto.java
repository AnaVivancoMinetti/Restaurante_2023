/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

/**
 *
 * @author MaRio
 */
public class PedidoProducto {
    
    private int id_pedido_producto;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public PedidoProducto() {
    }

    public PedidoProducto(int id_pedido_producto, Pedido pedido, Producto producto, int cantidad, double subtotal) {
        this.id_pedido_producto = id_pedido_producto;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public PedidoProducto(Pedido pedido, Producto producto, int cantidad, double subtotal) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getId_pedido_producto() {
        return id_pedido_producto;
    }

    public void setId_pedido_producto(int id_pedido_producto) {
        this.id_pedido_producto = id_pedido_producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    
}
