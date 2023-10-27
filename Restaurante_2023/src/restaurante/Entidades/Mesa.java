/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.Entidades;

/**
 *
 * @author MaRio
 */
public class Mesa {
    
    private int idMesa;
    private int numero;
    private boolean estado_mesa;
    private int capacidad;

    public Mesa() {
    }

    public Mesa(int numero, boolean estado_mesa, int capacidad) {
        this.numero = numero;
        this.estado_mesa = estado_mesa;
        this.capacidad = capacidad;
    }

    public Mesa(int idMesa, int numero, boolean estado_mesa, int capacidad) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.estado_mesa = estado_mesa;
        this.capacidad = capacidad;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado_mesa() {
        return estado_mesa;
    }

    public void setEstado_mesa(boolean estado_mesa) {
        this.estado_mesa = estado_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", numero=" + numero + ", estado_mesa=" + estado_mesa + ", capacidad=" + capacidad + '}';
    }
    
    
    
    
    
}
