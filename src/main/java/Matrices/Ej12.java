/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author smr1d
 */
public class Ej12 {
    
    public static void main(String[] args) {
        
        //Creamos el array char bidimensional 
        char [][] letras = {{'a','b','c'},{'d','e','f'}};
        
        //llamamos al metodo para mostrarlo por pantalla
        mostrarArray(letras);
        
    }
    
    //Metodo para mostrar por pantalla cada espacio del array
    public static void mostrarArray(char[][] aux){
        
        //Bucle for dentro de otro para recorrer todas las posiciones y mostrarlos
        for (int i = 0; i < aux.length; i++) {
            
            for (int j = 0; j < aux[i].length; j++) {
                
                System.out.println(aux[i][j]);
                
            }
            
        }
        
    }
    
}
