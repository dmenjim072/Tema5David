/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5DDavidMena;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author smr1d
 */
public class Ticket {
    
    private LocalDateTime fecha;
    private CintaTransportadora productosCinta;

    public Ticket() {
    }
        
    public Ticket(CintaTransportadora productosCinta) {
        this.fecha = LocalDateTime.now();
        this.productosCinta = productosCinta;
    }
        
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.fecha);
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
        final Ticket other = (Ticket) obj;
        return Objects.equals(this.fecha, other.fecha);
    }

    //Metodo que nos mostrara el ticket con su formato
    public String mostrarTicket() {
        
        return "---------------------------------------------------------------- \n"
                + "                 Supermercados Saavedra \n"
                + "             Fecha: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear()
                + "    Hora: " + fecha.getHour() + ":" + fecha.getMinute() + "\n"
                + "---------------------------------------------------------------- \n"
                + "Producto       Precio      Cantidad      IVA      Precio sin IVA  \n"
                + "---------------------------------------------------------------- \n"
                + productosCinta.mostrarProductos()                   + "\n"
                + "---------------------------------------------------------------- \n"
                + productosCinta.mostrarProductosIva() + "\n"
                + "---------------------------------------------------------------- \n"
                + "Total a pagar: " + precioTotal() + "  -- Gracias por su visita \n"
                + "----------------------------------------------------------------";
    }
    
    //Metodo para calcular el precio total del ticket
    public double precioTotal(){
        
        //Creamos la variable que vamos a devolver
        double totalTicket = 0;
        
        //Hacemos un bucle for para recorrer la lista de productos
        for (int i = 0; i < this.productosCinta.getCintaTransportadora().size(); i++) {
            
            //Vamos sumando a la variable todos los precios con IVA
            totalTicket = totalTicket + this.productosCinta.getCintaTransportadora().get(i).precioTotalConIva();

        }
        
        return totalTicket;
    }
    
    
}
