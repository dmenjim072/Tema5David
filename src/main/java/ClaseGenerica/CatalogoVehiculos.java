/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

/**
 *
 * @author david
 */

// crea la clase heredando de la clase Catalogo (extends)
public class CatalogoVehiculos extends Catalogo<Vehiculo> {
    
    public CatalogoVehiculos(int tamanio) {
        super(tamanio); // LLama al constructor de la clase padre
    }
    
    public Vehiculo buscarVehiculo(String bastidor) {//Creamos las variables para bastidor y un ejemplo de un vehiculo
        
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); //al ejemplo del vehiculo le asignamos el bastidor
        int posicion = this.buscarElemento(aux); //creamos una variable posicion que sera el coche que queramos buscar

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

}