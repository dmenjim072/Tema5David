/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author david
 */
public class OrdenacionBusqueda {
    
    public static void main(String[] args) {
        
        List<Pais> paises = new ArrayList<>();
        
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dolar Americano"));
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));
        
        //sout del forEach
        paises.forEach(System.out::println);
        System.out.println("----------------");
        
        //Ordenacion usando orden natural(requiere que Pais implemente Comparable)
        //Ordenar por nombre
        Collections.sort(paises);
        paises.forEach(System.out::println);
        System.out.println("-------------------");
        
        //Ordenacion usando comparator (proporcionamos el criterio mediante una lamda)
        Comparator<Pais> criterioSuperficie = (p1,p2)-> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioNombre = (p1,p2)-> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        Comparator<Pais> criterioPoblacion = (p1,p2)-> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        
        Collections.sort(paises, criterioPoblacion.reversed());//Para que lo ordene al reves
        
        //Ordena la lista por superficie y si hay resultados con el mismo numero entonces ordena por nombre
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        
        paises.forEach(System.out::println);
        
        //Ordena la lista por superficie y luego por poblacion
        Collections.sort(paises, criterioSuperficie);
        Collections.sort(paises, criterioPoblacion);
        
        
        
        //Busqueda por orden natural (por nombre)
        //la lista donde buscar la informacion debe estar ordenada previamente 
        //segun el criterio de orden natural (nombre)--> Comparable en Pais
        Collections.sort(paises);
        
        System.out.println("-------------------- Busqueda binaria-------------------");
        System.out.println("Lista ordenada segun orden natural (nombre) -------------");
        paises.forEach(System.out::println);
        
        Pais objetoBuscar = new Pais();
        
        objetoBuscar.setNombre("eeuu"); //Lista ordenada por nombre, buscada por nombre, la key es nombre
        
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        
        System.out.println("Portugal esta en la posicion " + posicion);
        
        //Si intento buscar en la lista con un valor que no es Nombre se obtendra una 
        //posicion erronea
        objetoBuscar.setNombre("");
        objetoBuscar.setPoblacion(23);
        
        posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println(posicion);
        //Si ordeno la lista por un criterio y busco por otro, el resultado es inesperado 
        
        
        System.out.println("-------------Ordenacion y busqueda por poblacion---------");
        
        //Antes de usar binarySearch por poblacion la lista debe estar ordenada por poblacion
        Collections.sort(paises, criterioPoblacion);
        
        paises.forEach(System.out::println);
        
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        
        System.out.println("El pais que tiene 146 millones es " + paises.get(posicion));
    }
    
}
