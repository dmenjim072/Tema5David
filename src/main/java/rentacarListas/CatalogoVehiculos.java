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
public class CatalogoVehiculos {
    
    private List<Vehiculo> lista;
    
    //El constructor recibe el tamaño del catalogo e inicializa la estructura
    //de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamaño){
        
        tamaño=Math.abs(tamaño);
                
        this.lista = new ArrayList<>(tamaño);
        
        //Una vez creada la estructura de datos le doy valor a cada elemento(de forma aleatoria)
        for (int i = 0; i < tamaño ;i++) {
            this.lista.add(new Vehiculo());
        }
    }
    
//    public void mostrarCatalogo(){
//        
//        for (Vehiculo v : listaVehiculos) {
//            System.out.println(v);
//        }
//        
//    }
        
    
    public boolean borrarVehiculo(Vehiculo v){
        
        int pos = buscarVehiculo(v);
        
        if(pos >=0){
            this.lista.remove(pos); //Borramos el vehiculo de esa posicion
        }return true;
    }
    
    private int buscarVehiculo(Vehiculo v) {
        //Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (v.equals(this.lista.get(1))) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public Vehiculo buscarVehiculos(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

    //nº de vehiculos que hay en el catalogo(no el tamaño del array)
    public int getNumeroVehiculos() {
        
        return this.lista.size();
    }

    public List<Vehiculo> getLista() {
        
        return lista;
    }   
    
    //Para añadir un vehiculo nuevo al array, primero buscamos si hay un espacio libre y sino 
    //creamos otro array nuevo copiando al anterior y añadiendo un espacio nuevo
    public void añadirVehiculo(Vehiculo v){
        
        this.lista.add(v);
    }
    
    public String toString(){
        
        String tmp = "";
        
        for (Vehiculo v : this.lista){
            if(v!=null){
                           
                tmp += v.toString() + "\n";
                
            }
        }
        return tmp;
    }        
                
}


