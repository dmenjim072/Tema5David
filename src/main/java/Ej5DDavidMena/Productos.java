/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5DDavidMena;

/**
 *
 * @author smr1d
 */
public class Productos {
    
    private String nombre;
    private double precio;
    private int cantidad;
    private int IVA;
    private double precioSinIVA;

    public Productos(String nombre, double precio, int cantidad, int IVA) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.IVA = IVA;
        this.precioSinIVA = precio / (IVA/100 + 1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    @Override
    public String toString() {
        return nombre + "           " + precio + "           " + cantidad + "           " + IVA + "           " + precioSinIVA;
    }
    
    //Metodo para calcular total con IVA
    public double precioTotalConIva() {

        double IVA1 = this.precio * (this.IVA / 100);
        double totalIVA = this.precio + IVA1;
        double resultado = this.cantidad * totalIVA;
        
        return Math.round(resultado * 100) / 100;

    }

    //Metodo para calcular total sin IVA
    public double precioTotalSinIva() {
        
        double resultado = this.cantidad * this.precio;
        
        return Math.round(resultado * 100) / 100;
    }
    
}
