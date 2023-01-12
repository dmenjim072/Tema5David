/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

import java.time.LocalDate;


/**
 *
 * @author david
 */
public class pruebasGenerico {
    
    public static void main(String[] args) {
        
        //Testing
        
        
        //CREAR
        //Creamos empresa
        Empresa e1 = new Empresa("asd", "asd");
        
        //Creamos vehiculos
        Vehiculo v1 = new Vehiculo("DGJ3439", "0515162");
        Vehiculo v2 = new Vehiculo("BRB4342", "0515162");
        
        //Creamos clientes
        Clientes c1 = new Clientes("David", "1541516X", "Mena");
        Clientes c2 = new Clientes("Pepe", "1541534X", "Navarro");
        
        //Creamos un alquiler (cliente y vehiculo)
        Alquileres a1 = new Alquileres(c1, v1, LocalDate.now(), 0);
        Alquileres a2 = new Alquileres(c2, v2, LocalDate.now(), 1);
        
        //AÑADIR
        //Añadimos el vehiculo al catalogo de vehiculos
        e1.registrarVehiculos(v1);
        
        //Añadimos el otro vehiculo al catalogo con otro metodo
        e1.getCatalogo3().añadirElemento(v2);
        
        //Añadimos clientes a la lista
        e1.getCatalogo2().añadirElemento(c1);
        e1.getCatalogo2().añadirElemento(c2);
        
        //Añadimos alquileres al catalogo
        e1.getCatalogo1().añadirElemento(a1);
        e1.getCatalogo1().añadirElemento(a2);
                
        //MOSTRAR
        //Mostramos todos los catalogos
        System.out.println("Vehiculos: \n \n" + e1.getCatalogo3());
        
        System.out.println("---------------------- \n");
        
        System.out.println("Clientes: \n \n" + e1.getCatalogo2());
        
        System.out.println("---------------------- \n");
        
        System.out.println("Alquileres: \n \n" + e1.getCatalogo1());
        
                
        //Intentamos devolver los alquileres realizados de un cliente
        //e1.devolverAlquileresDeCliente();
                
        //Borramos un alquiler por su ID y comprobamos la lista nuevamente
        e1.borrarAlquiler(0);
        
        System.out.println("Alquileres: " + e1.getCatalogo1());
        
        //Borramos un cliente(si no tiene alquileres) y comprobamos lista nuevamente
        e1.borrarClienteSinAlquileres(c1);
        
        System.out.println("Clientes despues de borrar: \n" + e1.getCatalogo2());
        
        //Mostramos la lista de vehiculos que se tienen que devolver en X fecha        
        System.out.println("Los vehiculos que se tienen que devolver " + LocalDate.now()
        + " son " + e1.devolucionVehiculos(LocalDate.now()));
    }
    
}
