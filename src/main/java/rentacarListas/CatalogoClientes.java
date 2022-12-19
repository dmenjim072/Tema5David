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
public class CatalogoClientes {
    
    private List<Clientes> lista;

    //Constructor dando tamaño
    public CatalogoClientes(int tamaño){
        
        tamaño = Math.abs(tamaño);//Para pasarlo a positivo
        
        this.lista = new ArrayList<>(tamaño);
        
        //Una vez creada la estructura de datos le doy valor a cada elemento(de forma aleatoria)
        for (int i = 0; i < tamaño; i++) {
            this.lista.add(new Clientes());
        }
        
    }    
    
    //Metodo para buscar un cliente en concreto
     private int buscarCliente(Clientes c) {
        //Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (c.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }
     
      public Clientes buscarCliente(String nif) {
        Clientes aux = new Clientes();
        aux.setNIF(nif);
        int posicion = buscarCliente(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
        
    //Metodo para borrar vehiculo
    public void borrarClienteSeleccionado(Clientes x){
        
        //Creamos una variable para determinar la posicion
        int pos = buscarCliente(x);
        
        //Recorremos la lista para borrar el cliente seleccionado        
            this.lista.remove(pos);
       
    }
        
    //Metodo para borrar todos los clientes
    public void borrarTodosClientes(){
        
        this.lista.clear();
        
    }
    
    //Metodo para borrar todos los clientes
    public void borrarPrimerCliente(){
        
        for (int i = 0; i < listaClientes.length; i++) {
            if(listaClientes[i] != null){
                listaClientes[i] = null;
                break; //Ponemos el break para que se pare despues de borrar el primero
            }
        }
    }
    
    //Metodo para mostrar el catalogo
//    public void mostrarCatalogo(CatalogoClientes c){
//        
//        for (int i = 0; i < listaClientes.length; i++) {
//            System.out.println(listaClientes[i]);
//        }
//        
//    } 
                    
}

