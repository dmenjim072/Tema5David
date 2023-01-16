/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5DDavidMena;

import java.util.Objects;

/**
 *
 * @author smr1d
 */
public class Caja {
    
    private int identificador;
    private CintaTransportadora productosCinta;

    private int id = 0;

    public Caja(int identificador, CintaTransportadora cinta) {
        this.identificador = id++;
        this.productosCinta = cinta;
    }

    //Gettersy Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public CintaTransportadora getCinta() {
        return productosCinta;
    }

    public void setCinta(CintaTransportadora cinta) {
        this.productosCinta = cinta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.identificador;
        hash = 89 * hash + Objects.hashCode(this.productosCinta);
        hash = 89 * hash + this.id;
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
        final Caja other = (Caja) obj;
        if (this.identificador != other.identificador) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.productosCinta, other.productosCinta);
    }

    @Override
    public String toString() {
        return "Caja{" + "identificador=" + identificador + ", cinta=" + productosCinta + ", id=" + id + '}';
    }
    
    //Metodo para crear un ticket con los productos de la caja
    public Ticket generarTicket(){
        
        Ticket ejemploTicket = new Ticket();
                
        return ejemploTicket;        
    }
}
