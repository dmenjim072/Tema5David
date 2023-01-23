/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5DDavidMena;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author smr1d
 */
public class CintaTransportadora {
    
    private int numeroProdutosIVA4, numeroProdutosIVA10, numeroProdutosIVA21;
    private double totalIVA4, totalIVA10, totalIVA21;
    private double totalSinIVA4, totalSinIVA10, totalSinIVA21;
    
    //Creamos una lista de tipo productos
    private ArrayList<Productos> listaProductos;
    
    //Constructor 
    public CintaTransportadora() {
        this.listaProductos = new ArrayList<>();
    }

    //Getter y Setter
    public ArrayList<Productos> getCintaTransportadora() {
        return listaProductos;
    }

    public void setCintaTransportadora(ArrayList<Productos> cintaTransportadora) {
        this.listaProductos = cintaTransportadora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.listaProductos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CintaTransportadora other = (CintaTransportadora) obj;
        return Objects.equals(this.listaProductos, other.listaProductos);
    }
    
    @Override
    public String toString() {
        return "CintaTransportadora{" + "cintaTransportadora=" + listaProductos + '}';
    }
    
    
        
    //Metodo para añadir producto a la cinta
    public void añadirProducto(Productos ejemplo){
        
        this.listaProductos.add(ejemplo);
        
    }
    
    //Metodo para eliminar producto a la cinta
    public void eliminarProducto (Productos ejemplo){
        
        this.listaProductos.remove(ejemplo);
        
    }
    
    //Metodo para saber si la cinta esta vacia
    public boolean isCintaVacia(){
        
        return this.listaProductos.isEmpty();
        
    }
    
    //Metodo para que genere los productos en el ticket
    public String mostrarProductos(){
        
        String listaProductos1 = "";
        
        for (int i = 0; i < this.listaProductos.size(); i++) {
            listaProductos1 += this.listaProductos.get(i).toString() + "\n";
        }
        
        return listaProductos1;
    }
    
    //Metodo para que genere la parte del IVA del ticket
    public String mostrarProductosIva() {
        
        String formatoIVA = "";
        
        //Hacemos un bucle para recorrer la lista de productos
        for (int i = 0; i < this.listaProductos.size(); i++) {
            
            //Hacemos un switch para diferenciar el IVA que tengan
            switch (this.listaProductos.get(i).getIVA()) {
                
                //Hacemos los calculos segun el tipo de IVA
                case 4: {
                    numeroProdutosIVA4 += this.listaProductos.get(i).getCantidad();
                    totalSinIVA4 += this.listaProductos.get(i).precioTotalSinIva();
                    totalIVA4 += this.listaProductos.get(i).precioTotalConIva();
                }
                case 10: {
                    numeroProdutosIVA10 += this.listaProductos.get(i).getCantidad();
                    totalSinIVA10 += this.listaProductos.get(i).precioTotalSinIva();
                    totalIVA10 += this.listaProductos.get(i).precioTotalConIva();
                }
                case 21: {
                    numeroProdutosIVA21 += this.listaProductos.get(i).getCantidad();
                    totalSinIVA21 += this.listaProductos.get(i).precioTotalSinIva();
                    totalIVA21 += this.listaProductos.get(i).precioTotalConIva();
                }
                default: {
                }

            }
            
            //Le damos formato con un textblock para generar esta parte
            formatoIVA= """
                        Nº prod. IVA 4%%:   %d    Precio sin IVA: %.2f       Precio con IVA: %.2f  
                        Nº prod. IVA 10%%:  %d    Precio sin IVA: %.2f       Precio con IVA: %.2f  
                        Nº prod. IVA 21%%:  %d    Precio sin IVA: %.2f       Precio con IVA: %.2f  
                        """.formatted(numeroProdutosIVA4,totalSinIVA4,totalIVA4,
                                 numeroProdutosIVA10,totalSinIVA10,totalIVA10,
                                 numeroProdutosIVA21,totalSinIVA21,totalIVA21);
            
        }
        return formatoIVA;
    }
}