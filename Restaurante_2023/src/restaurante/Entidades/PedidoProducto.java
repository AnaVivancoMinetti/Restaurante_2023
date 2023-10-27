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

    public PedidoProducto() {
    }

    public PedidoProducto(int id_pedido_producto, Pedido pedido, Producto producto, int cantidad) {
        this.id_pedido_producto = id_pedido_producto;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public PedidoProducto(Pedido pedido, Producto producto, int cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
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

    @Override
    public String toString() {
        return "PedidoProducto{" + "id_pedido_producto=" + id_pedido_producto + ", pedido=" + pedido + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
