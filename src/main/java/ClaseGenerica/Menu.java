/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;

import rentacarListas.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author smr1d
 */
public class Menu {
    
    public static void main(String[] args) {
        
        //Variables
        String opcion = "";
        
        //Creamos la empresa
        Empresa empresa = new Empresa(opcion, opcion);
        
        //Hacemos un bucle para el menu de opciones
        do{
                                                
            //Metemos el menu en la variable texto con diferentes opciones
            opcion = JOptionPane.showInputDialog("BIENVENIDO A RENTACAR \n"
                + "---------------------------- \n"
                + "Pulse 1 para registrarse como cliente \n"
                + "Pulse 2 para registrar un coche \n"
                + "Pulse 3 para ver el catalogo de coches disponibles \n"
                + "Pulse 4 para alquilar un coche \n"
                + "Escriba SALIR para salir del programa \n"
                + "----------------------------");
                        
            //Segun la opcion elegida hara lo siguiente
            switch (opcion) {
                case "1"://Registrar cliente
                                                             
                    String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
                    String apellido = JOptionPane.showInputDialog("Introduce tu primer apellido");
                    String NIF = JOptionPane.showInputDialog("Introduce tu NIF");
                    
                    Clientes persona = new Clientes(nombre, NIF, apellido);
                    
                    empresa.getCatalogo2().añadirClientes(persona);
                                        
                    JOptionPane.showMessageDialog(null,"El cliente ha sido registrado");
                    
                    break;

                case "2"://Registrar coche
                    
                    //Pedimos la el bastidor del vehiculo
                    String bastidor = JOptionPane.showInputDialog("Introduce el bastidor del vehiculo a registrar");
                    
                    //Creamos un vehiculo nuevo con el bastidor seleccionado y lo añadimos al catalogo de vehiculos
                    Vehiculo vehiculo = new Vehiculo(bastidor);
                    
                    empresa.getCatalogo3().añadirVehiculo(vehiculo);
                    
                    JOptionPane.showMessageDialog(null, "El vehiculo ha sido registrado");
                    
                    break;
                    
                case "3"://Ver coches disponibles
                    
                    
                    //Mostramos el catalogo vehiculos con un toString
                    System.out.println(empresa.getCatalogo3().toString());
                                       
                    JOptionPane.showMessageDialog(null,"El catalogo ha sido mostrado por teclado");
                    
                    break;
                    
                case "4"://Realizar alquiler
                    
                    //Pedimos el NIF y bastidor para saber si estan disponibles
                    String NIF2 = JOptionPane.showInputDialog("Introduce tu NIF");
                    String bastidor2 = JOptionPane.showInputDialog("Introduce el bastidor del coche");
                    
                    //Creamos una variable para guardar el numero de dias que se utilizara el coche
                    int numeroDias2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dias que vas a usar el vehiculo"));
                    
                    //Creamos el alquiler y lo añadimos al catalogo
                    Alquileres alquiler = new Alquileres(empresa.buscarClientes(NIF2), empresa.buscarVehiculo(bastidor2), LocalDate.now(), numeroDias2);
                    
                    empresa.getCatalogo1().añadirAlquileres(alquiler);
                            
                    System.out.println("El alquiler del coche con bastidor: " + bastidor2 + " ha sido realizado");
                    break;              
            }
            
        }while(!opcion.equalsIgnoreCase("salir"));//Se repite hasta que escribamos SALIR
                
        
    }
    
}
