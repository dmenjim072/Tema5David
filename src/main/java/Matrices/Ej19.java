/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import ClaseGenerica.Alquileres;
import ClaseGenerica.Clientes;
import ClaseGenerica.Vehiculo;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author smr1d
 */
public class Ej19 {
    
    public static void main(String[] args) {
        
        int[][] asientosAvion = new int [25][4];
        
        String opcion;
        int fila;
        int asiento;
        
        // Creacion menu de dos opciones (ENTRAR o SALIR)
         do{
                                                
            //Metemos el menu en la variable texto con diferentes opciones
            opcion = JOptionPane.showInputDialog("BIENVENIDO A Ryanair \n"
                + "---------------------------- \n"
                + "Pulse 1 para reservar un asiento \n"
                + "Pulse 2 para cancelar un asiento \n"
                + "Pulse 3 para ver asientos disponibles \n"
                + "Escriba SALIR para salir del programa \n"
                + "----------------------------");
                        
            //Segun la opcion elegida hara lo siguiente
            switch (opcion) {
                
                //Pide un asiento al cliente, revisamos si esta disponible y se lo reservamos
                case "1":
                    
                    //Pedimos la fila
                     do {

                        String filaString = JOptionPane.showInputDialog("Selecciona una fila (1-24)");
                        fila = Integer.parseInt(filaString);
                        
                        if (!(fila >= 1 && fila <= 24)) {
                            
                            JOptionPane.showMessageDialog(null, "El avion solo tiene 24 filas");
                            
                        }
                    } while (!(fila >= 1 && fila <= 24));
                    
                    
                    //Pedimos el asiento                    
                    do {
                        
                        String asientoString = JOptionPane.showInputDialog("Introduce el asiento de la fila (1-4)");
                        asiento = Integer.parseInt(asientoString);

                        if (!(asiento >= 1 && asiento <= 4)) {
                            System.out.println("El avión solo tiene 4 asientos por fila");
                        }
                        
                    } while (!(asiento >= 1 && asiento <= 4));

                    
//                    for (int i = 0; i < asientosAvion.length; i++) {
//                        for (int j = 0; j < asientosAvion[i].length; j++) {
//                            if
//                        }
//                    }
                    break;

                case "2":
                    
                    break;
                    
                case "3"://Ver coches disponibles
                    
                    
                   
                    
                    
                    break;
                    
                case "4":
                    
                    
                    break;              
            }
            
        }while(!opcion.equalsIgnoreCase("salir"));//Se repite hasta que escribamos SALIR
        

    
    }
        
}
    
    
        
        
