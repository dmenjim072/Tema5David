/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarListas;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class CatalogoClientes {
    
    private int numeroClientes;
    private Clientes[] listaClientes;//Creamos un array de clientes

    //Constructor dando tamaño
    public CatalogoClientes(int tamaño){
        
        tamaño = Math.abs(tamaño);//Para pasarlo a positivo
        
        this.numeroClientes = 0;
        this.listaClientes = new Clientes[tamaño];
        
    }
    
    //Metodo para añadir clientes al catalogo
    public void añadirClientes(Clientes x){
        
        //Si hay hueco se inserta en el hueco
        if(this.numeroClientes<listaClientes.length){
            
            //Recorremos el array para añadirle clientes al catalogo
            for (int i = 0; i < listaClientes.length; i++) {
                
                //Elejimos la posicion(la primera que este vacia)
                if(this.listaClientes[i] == null){
                    this.listaClientes[i] = x;
                    this.numeroClientes++;
                    System.out.println("Guardando cliente en posicion: " + i);
                    break;
                }
            }
        }else{//Si no hay hueco creamos un array nuevo copiando el actual y añadiendo un hueco mas
            this.listaClientes = Arrays.copyOf(listaClientes, ++numeroClientes);
        }
        
    } 
    
    //Metodo para buscar un cliente en concreto
     private int buscarCliente(Clientes c) {
        //Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
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
        return (posicion >= 0) ? this.listaClientes[posicion] : null;
    }
        
    //Metodo para borrar vehiculo
    public void borrarClienteSeleccionado(Clientes x){
        
        //Creamos una variable para determinar la posicion
        int pos = buscarCliente(x);
        
        //Recorremos el array para borrar el cliente seleccionado
        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[pos] = null;
        }
    }
        
    //Metodo para borrar todos los clientes
    public void borrarTodosClientes(){
        
        for (int i = 0; i < listaClientes.length; i++) {
            if(listaClientes[i] != null){
                listaClientes[i] = null;
                //Sin break
            }
        }
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
    public void mostrarCatalogo(CatalogoClientes c){
        
        for (int i = 0; i < listaClientes.length; i++) {
            System.out.println(listaClientes[i]);
        }
        
    } 
                    
}

