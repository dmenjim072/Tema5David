/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

/**
 *
 * @author david
 */
public class CatalogoAlquileres extends Catalogo<Alquileres> {

    public CatalogoAlquileres(int tamaño) {
        super(tamaño);
    }
    
    //Metodo para buscar un alquiler por su ID
    public Alquileres buscarAlquiler(int alquilerID){
        
        Alquileres aux = new Alquileres();
        aux.setAlquilerID(alquilerID);
        int posicion = this.buscarElemento(aux);
        
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
}
