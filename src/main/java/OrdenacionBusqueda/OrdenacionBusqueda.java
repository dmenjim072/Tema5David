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
        
        paises.forEach(System.out::println);
    }
    
}
