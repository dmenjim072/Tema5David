/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author david
 */
public class EjemploMatriz {
    
    public static void main(String[] args) {
        
        int [][] matriz = {
            {1,3,5,7},
            {4,6,3,8},
            {4,4,1,1},
            {0,3,6,8}
        };
        
        //Comprobamos fila y columna para que sean validas
        System.out.println("Las casillas vecinas son: \n");
        
        casillasVecinas(1, 1, matriz);
        
        System.out.println("--------------------------------");
        
        //Mostramos la matriz completa
        System.out.println("La matriz completa es: \n");
        
        mostrar(matriz);
        
        System.out.println("--------------------------------");
        
        //Mostramos la diagonal de la matriz
        System.out.println("La diagonal de la matriz es: \n");
        
        List<Integer> diagonal = elementoDiagonalPrincipal(matriz);
        diagonal.forEach(System.out::println);
        
        //System.out.println(Arrays.toString(elementoDiagonalSecundaria(matriz)));
        
        
        
        
    }
    
    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m){
        
        List<Casilla> lista = new ArrayList<>();
        
        if (esFilaValida(fila, m) && esColumnaValida(columna, m)){
            
            //Hacemos que no salga de la fila
            for (int i = fila-1; i <= fila+1; i++) {
                
                //Hacemos que no se salga de la columna
                for (int j = columna-1; j <= columna+1; j++) {
                    
                    //Si la columna no es valida no la muestra
                    if(i==fila && j==columna){
                        System.out.println("Es la casilla que estamos mirando");
                    }else {
                        System.out.println("Casilla " + i + " " + j);
                    }
                    
                    
                    
                }
                
            }
            
        }
        
        return lista;
    }
    
    //Metodo para comprobar que la fila sea valida
    public static boolean esFilaValida(int fila, int[][] matriz){
        
        return fila >= 0 && fila < matriz.length;
        
    }
    
    //Metodo para comprobar que la columna sea valida
    public static boolean esColumnaValida(int columna, int[][] matriz){
        
        return columna >= 0 && columna < matriz.length;
        
    }
    
    public static int[] elementoDiagonalSecundaria(int[][] m){
        
        int[] array = new int[m.length];
        
        for (int i = 0; i < 10; i++) {
            
            array[i] = m[i][m.length -1 -i];
            
        }
        
        return array;
    }
    
    public static List<Integer> elementoDiagonalPrincipal(int[][] m){
        
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < m.length; i++) {
            
            lista.add(m[i][i]);
            
        }
        
        return lista;
        
    }
    
    public static void mostrar(int[][] m){
        for (int[] fila : m) { //Por cada fila de la matriz m
            
            for (int valor : fila) { //Por cada elemento del array fila
                
                System.out.print(valor + "");
                
            }
            
            System.out.println("");
            
        }
    }
    
}
