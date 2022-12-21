/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */

//Clase generica, sirve para cualquier tipo de objeto
public class Catalogo<T> {
    
    protected List<T> lista;
    
    //El constructor recibe el tamaño del catalogo e inicializa la estructura
    //de datos con vehiculos aleatorios
    public Catalogo(int tamaño){
        
        tamaño=Math.abs(tamaño);
                
        this.lista = new ArrayList<>(tamaño);
        
        //lista size() es 0
               
        }
    
     public boolean borrarElemento(T elemento){
        
        int pos = buscarElemento(elemento);
        
        if(pos >=0){
            this.lista.remove(pos); //Borramos el vehiculo de esa posicion
        }return true;
    } 
    
    public int buscarElemento(T elemento) {
        //Búsqueda secuencial
        if (elemento != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (elemento.equals(this.lista.get(1))) {
                    return i;
                }
            }
        }
        return -1;
    }
    
   
    //nº de elementos que hay en el catalogo(no el tamaño del array)
    public int getNumeroElementos() {
        
        return this.lista.size();
    }

    public List<T> getLista() {
        return lista;
    }

     
    
    //Para añadir un vehiculo nuevo al array, primero buscamos si hay un espacio libre y sino 
    //creamos otro array nuevo copiando al anterior y añadiendo un espacio nuevo
    public void añadirElemento(T elemento){
        
        this.lista.add(elemento);
    }
    
    public String toString(){
        
        String tmp = "";
        
        for (T objeto : this.lista){
            
                           
                tmp += objeto.toString() + "\n";
                
           
        }
        return tmp;
    }        
    
}

    //ACABAR    
    

    
   