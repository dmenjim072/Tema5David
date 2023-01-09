/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

/**
 *
 * @author david
 */
public class CatalogoClientes extends Catalogo<Clientes> {

    public CatalogoClientes(int tamanio) {
        super(tamanio);
    }
    
    //Metodo para buscar un cliente por su NIF
    public Clientes buscarCliente(String nif) {//Creamos las variables para bastidor y un ejemplo de un vehiculo
        
        Clientes aux = new Clientes();
        aux.setNIF(nif); //al ejemplo del cliente le asignamos el bastidor
        int posicion = this.buscarElemento(aux); //creamos una variable posicion que sera el cliente que queramos buscar

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
    
}
