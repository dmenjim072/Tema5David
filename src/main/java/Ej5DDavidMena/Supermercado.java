/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5DDavidMena;

/**
 *
 * @author smr1d
 */
public class Supermercado {
    
    public static Ticket generarTicket(CintaTransportadora productosCinta){
        
        Ticket aux = new Ticket(productosCinta);
                       
        return aux;
    }
    
    public static void main(String[] args) {
        
        //Creamos los productos
        Productos packYogur = new Productos("yogur", 1.50, 1, 21);
        Productos champu = new Productos("champu", 2.0, 1, 21);
        Productos packAtun = new Productos("atun", 3, 1, 10);
        Productos jamon = new Productos("jamon", 2.20, 1, 4);
        Productos zumo = new Productos("zumo", 1.20, 1, 4);
                
        //Creamos la cinta
        CintaTransportadora cinta1 = new CintaTransportadora();
        
        //Creamos la caja
        Caja c1 = new Caja(1, cinta1);
        
        //Creamos el ticket
        Ticket t1 = new Ticket(cinta1);
        
        //Añadimos los productos a la cinta
        c1.getCinta().añadirProducto(jamon);
        c1.getCinta().añadirProducto(champu);
        c1.getCinta().añadirProducto(packAtun);
        c1.getCinta().añadirProducto(packYogur);
        c1.getCinta().añadirProducto(zumo);
                
        //Mostramos el ticket
        System.out.println(t1.mostrarTicket());
        

    }
    

}
