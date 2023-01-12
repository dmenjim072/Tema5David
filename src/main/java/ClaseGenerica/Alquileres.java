/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

import rentacarListas.*;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author david
 */
public class Alquileres {
    
    private int alquilerID;
    private Clientes cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private static int contador = 0;
    private int numeroDias;

    public Alquileres(Clientes cliente, Vehiculo vehiculo, LocalDate fechaInicio, int numeroDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;        
        contador++;
        this.alquilerID = contador;
        this.numeroDias = numeroDias;
    }

    public Alquileres() {           
        this.alquilerID = contador;//Le ponemos un contador para que vaya sumandose 1 por cada alquiler
        contador++;
        this.cliente = new Clientes();
        this.vehiculo = new Vehiculo();
        this.fechaInicio = LocalDate.now(); 
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }
           
    
    public int getAlquilerID() {
        return alquilerID;
    }

    public void setAlquilerID(int alquilerID) {
        this.alquilerID = alquilerID;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Alquileres.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.alquilerID;
        hash = 97 * hash + Objects.hashCode(this.cliente.getNIF());
        hash = 97 * hash + Objects.hashCode(this.vehiculo.getBastidor());
        hash = 97 * hash + Objects.hashCode(this.fechaInicio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alquileres other = (Alquileres) obj;
        return this.alquilerID == other.alquilerID;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "alquilerID=" + alquilerID + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaInicio=" + fechaInicio + ", numeroDias=" + numeroDias + '}';
    }
    
    
    
}
