/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author smr1d
 */
public class Ej14 {
    
    public static void main(String[] args) {
        
        //Creamos el array int bidimensional 
        int [][] numeros = new int[3][3];
        
        
        //Recorro cada posicion del array con un doble bucle for
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[i].length; j++) {
                
                //A cada posicion del array bi le doy un valor random(1-100)
                numeros[i][j] = (int)(Math.random()*100+1);
                
                //Muestro cada posicion por pantalla
                System.out.println(numeros[i][j]);
                
            }
            
        }
        
        System.out.println("------------------------------------");
        
        //Creamos las variables para calcular la media
        double media = 0;
        double resultado = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[i].length; j++) {
                
                //Vamos sumando en la variable todos los numeros de las posiciones
                media += numeros[i][j];
            }
        }
        
        //Guardamos la media en la variable resultado haciendo la formula
        resultado = media / (numeros.length * numeros.length);
        
        System.out.println("La media del array es: " + resultado);
        
        System.out.println("-------------------------------------");
        
        //Creamos las variables para el valor minimo y maximo
        int minimo = 100;
        int maximo = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                
                //Hacemos que en cada posicion, si el numero de esa posicion es
                //menor a 100 se guarde en la variable y luego se compare a ese 
                //nuevo numero
                if(numeros[i][j]<minimo){
                    minimo = numeros[i][j];
                }
                
                //Hacmos lo mismo pero al reves para quedarnos con el numero mas alto
                if(numeros[i][j]>maximo){
                    maximo = numeros[i][j];
                }
                
            }
        }
        
        System.out.println("El minimo es: " + minimo);
        
        System.out.println("El maximo es: " + maximo);
        
    }
    
}
