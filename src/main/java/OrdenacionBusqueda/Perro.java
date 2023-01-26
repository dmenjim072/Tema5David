/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.Objects;

/**
 *
 * @author david
 */
public class Perro implements Comparable<Perro>{
    
    private String raza;
    private String lugarOrigen;
    private int pesoAdulto;

    public Perro() {
    }

    public Perro(String raza, String lugarOrigen, int pesoAdulto) {
        this.raza = raza;
        this.lugarOrigen = lugarOrigen;
        this.pesoAdulto = pesoAdulto;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public int getPesoAdulto() {
        return pesoAdulto;
    }

    public void setPesoAdulto(int pesoAdulto) {
        this.pesoAdulto = pesoAdulto;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", lugarOrigen=" + lugarOrigen + ", pesoAdulto=" + pesoAdulto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.raza);
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
        final Perro other = (Perro) obj;
        return Objects.equals(this.raza, other.raza);
    }
    
  
    @Override
    public int compareTo(Perro o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
