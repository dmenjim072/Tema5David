/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

import rentacarListas.*;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author david
 */
public class Vehiculo {
    
    private String bastidor;
    private String matricula;
    
    private boolean disponible;
    private double tarifa;
    
    public Vehiculo(String matricula,String bastidor){
        this.bastidor = bastidor;
        this.matricula = matricula;     
        this.disponible = true;
    }

    public Vehiculo() {
    }
        
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.bastidor);
        hash = 17 * hash + Objects.hashCode(this.matricula);      
        hash = 17 * hash + (this.disponible ? 1 : 0);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.bastidor, other.bastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", disponible=" + disponible + ", tarifa=" + tarifa + '}';
    }
   
    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getBastidor() {
        return bastidor;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public double getTarifa() {
        return tarifa;
    }   
    
              
}
