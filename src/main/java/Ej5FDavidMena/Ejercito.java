/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5FDavidMena;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author david
 */
public class Ejercito {
    
    private Set<Soldado> ejercito;
    private int numeroSoldado;
    
    public static Scanner teclado = new Scanner(System.in);

    public Ejercito(Set<Soldado> ejercito, int numeroSoldado) {
        this.ejercito = new HashSet<>();
        this.numeroSoldado = numeroSoldado;
    }
    
                    
    //Metodo para obtener el numero de soldados
    public int numeroSoldado(Set<Soldado> ejercito){
        
        return ejercito.size();
    }
    
    
    //Metodo para alistar un soldado
    public void alistarSoldado(Set<Soldado> ejercito){
        
        //Pedimos los datos por teclado del soldado
        
        System.out.println("Introduce el NIF del soldado");
        String NIF = teclado.nextLine();
        
        System.out.println("Introduce el nombre del soldado");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce el primer apellido del soldado");
        String apellido1 = teclado.nextLine();
        
        System.out.println("Introduce el segundo apellido del soldado");
        String apellido2 = teclado.nextLine();
        
        System.out.println("Introduce la edad del soldado");
        int edad = teclado.nextInt();
        
        //Y añadimos un nuevo soldado al ejercito con esos datos
        ejercito.add(new Soldado(NIF, nombre, apellido1, apellido2, edad));
        
    }
    
    //Metodo para saber si el ejercito esta vacio
    public boolean isEjercitoVacio(Set<Soldado> ejercito){
        
        return ejercito.isEmpty();
    }
    
    //Metodo para saber si un soldado esta alistado
    public boolean isSoldadoAlistado(Set<Soldado> ejercito){
                        
        System.out.println("Introduce el NIF del soldado a buscar");
        String NIF = teclado.nextLine();
        
        return ejercito.contains(new Soldado(NIF, "", "", "", 0));
    }
    
    //Metodo para imprimir todos los soldados en forma de ArrayList
    public void imprimirSoldados(Set<Soldado> ejercito){
        
        List<Soldado> listaSoldados = new ArrayList<>(ejercito);
        
        listaSoldados.forEach(System.out::println);
        
    }
    
    //Metodo para desmatricular un soldado que esta en el ejercito
    public void desmatricularSoldado(Set<Soldado> ejercito){
        
        System.out.println("Introduce el NIF del soldado a desmatricular");
        String NIF = teclado.nextLine();
        
        Soldado aux = new Soldado(NIF, "", "", "", 0);
        
        if(ejercito.equals(aux.getNIF())){
            
            System.out.println("El soldado no esta alistado");
            
        }else{
            
            ejercito.remove(aux);
            
            System.out.println("El soldado ha sido desmatriculado");
            
        }
    }
    
}
