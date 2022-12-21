/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarListas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author david
 */
public class CatalogoAlquileres {
    
    private List<Alquileres> lista;

    //Constructor dando tamaño
    public CatalogoAlquileres(int tamaño){
        
        tamaño = Math.abs(tamaño);//Para pasarlo a positivo
        
        this.lista = new ArrayList<>(tamaño);
        
        //Una vez creada la estructura de datos le doy valor a cada elemento(de forma aleatoria)
        for (int i = 0; i < tamaño; i++) {
            this.lista.add(new Alquileres());
        }
        
    }    
    
    //Metodo para buscar un cliente en concreto
     private int buscarCliente(Alquileres a) {
        //Búsqueda secuencial
        if (a != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (a.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }
               
    //Metodo para borrar vehiculo
    public void borrarClienteSeleccionado(Alquileres a){
        
        //Creamos una variable para determinar la posicion
        int pos = buscarCliente(a);
        
        //Recorremos la lista para borrar el cliente seleccionado        
        this.lista.remove(pos);
       
    }
        
    //Metodo para borrar todos los clientes
    public void borrarTodosAlquileres(){
        
        this.lista.clear();
        
    }
    
     public void añadirAlquileres(Alquileres a){
        
        this.lista.add(a);
    }
    
}



