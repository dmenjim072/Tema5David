/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5EDavidMena;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class EjercicioB {
    
    public static void main(String[] args) {
        
        int alturaCopa = 0;
        
        do{
        
            String alturaCopaString = (JOptionPane.showInputDialog("Introduce la altura del arbol(2 - 10)"));
            alturaCopa = Integer.parseInt(alturaCopaString);
            
            int [][] arbolCopa = new int [alturaCopa][3];
        
        }while(alturaCopa>10 || alturaCopa<2);
        
    }
    
}
