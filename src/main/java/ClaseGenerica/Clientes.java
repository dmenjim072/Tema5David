/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

import rentacarListas.*;

/**
 *
 * @author david
 */
public class Clientes {
    
    String nombre;
    String NIF;
    String apellido;

    //Constructor vacio
    public Clientes() {
    }

    //Constructor parametrizado
    public Clientes(String nombre, String NIF, String apellido) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.apellido = apellido;
    }

    //Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "CatalogoClientes{" + "nombre=" + nombre + ", NIF=" + NIF + ", apellido=" + apellido + '}';
    }
            
}
