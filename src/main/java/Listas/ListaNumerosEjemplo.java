/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ListaNumerosEjemplo {
    
    public static void main(String[] args) {
        
        //Creamos una lista llamada listaEnteros de tipo int
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        
        //Añadimos elementos a la lista
        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);
        
        //Mostramos cuantos elementos tiene con el size
        System.out.println("Tamaño de la lista " + listaEnteros.size());
        
        //Hacemos un bucle para recorrer la lista y que nos diga el valor de cada elemento
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println("Elemento " + (i+1) + " -> " + listaEnteros.get(i));
        }
        
        //Comprobamos si el 7 esta en la lista
        if (listaEnteros.contains(7)){
            System.out.println("El 7 esta en la lista");
        }
        
        int posicion = listaEnteros.indexOf(7);
        
        System.out.println("El 7 esta en la posicion " + posicion);//Dice la posicion desde el 0
        
        //Para borrar la posicion numero 10
        Integer numero = 10;
        listaEnteros.remove(10);
        
        //Para borrar el numero 10 de esta lista
        listaEnteros.remove(10);
       
        
        //Añadimos el 100 a la lista        
        listaEnteros.add(100);
        
        //Mostramos toda la lista
        listaEnteros.forEach(System.out::println);
        
        System.out.println("-------------------");
        
        for (Integer num : listaEnteros) {
            System.out.println(" " + num);
        }
        
        System.out.println("");
        listaEnteros.set(0, 200);
    }
    
}
