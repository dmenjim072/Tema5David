/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGenerica;


import java.util.ArrayList;
import rentacarListas.*;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author david
 */
public class Empresa {
    
    private String CIF;
    private String nombre;
    
    private CatalogoAlquileres catalogo1;
    private CatalogoClientes catalogo2;
    private CatalogoVehiculos catalogo3;

    public Empresa() {
    }

    public Empresa(String CIF, String nombre) {
        this.CIF = RandomStringUtils.randomAlphabetic(1) + RandomStringUtils.randomAlphanumeric(7) + RandomStringUtils.randomAlphabetic(1);
        this.nombre = RandomStringUtils.randomAlphabetic(6);
        this.catalogo1 =  new CatalogoAlquileres(0);
        this.catalogo2 = new CatalogoClientes(0);
        this.catalogo3 = new CatalogoVehiculos(0);
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogoAlquileres getCatalogo1() {
        return catalogo1;
    }

    public void setCatalogo1(CatalogoAlquileres catalogo1) {
        this.catalogo1 = catalogo1;
    }

    public CatalogoClientes getCatalogo2() {
        return catalogo2;
    }

    public void setCatalogo2(CatalogoClientes catalogo2) {
        this.catalogo2 = catalogo2;
    }

    public CatalogoVehiculos getCatalogo3() {
        return catalogo3;
    }

    public void setCatalogo3(CatalogoVehiculos catalogo3) {
        this.catalogo3 = catalogo3;
    }

    @Override
    public String toString() {
        return "Empresa{" + "CIF=" + CIF + ", nombre=" + nombre + ", catalogo1=" + catalogo1 + ", catalogo2=" + catalogo2 + ", catalogo3=" + catalogo3 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.CIF);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.catalogo1);
        hash = 59 * hash + Objects.hashCode(this.catalogo2);
        hash = 59 * hash + Objects.hashCode(this.catalogo3);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.CIF, other.CIF)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.catalogo1, other.catalogo1)) {
            return false;
        }
        if (!Objects.equals(this.catalogo2, other.catalogo2)) {
            return false;
        }
        return Objects.equals(this.catalogo3, other.catalogo3);
    }

    //Metodo para registrar clientes
    public void registrarClientes(Clientes x){
        
        this.catalogo2.añadirElemento(x);
        
    }
    
    //Metodo para registrar vehiculos
    public void registrarVehiculos(Vehiculo v){
        
        this.catalogo3.añadirElemento(v);
        
    }
    
    //Metodo para registrar alquileres
    public void registrarAlquiler(Alquileres a) {
        
        this.catalogo1.añadirElemento(a);
    
    }
    
    //Metodo para buscar clientes
    public void buscarCliente(String NIF){
        
        this.catalogo2.buscarCliente(NIF);
               
    }
    
    //Metodo para buscar vehiculos
    public void buscarVehiculo(String bastidor){
        
        this.catalogo3.buscarVehiculo(bastidor);
        
    }
    
    //Metodo para buscar vehiculos
    public void buscarAlquiler(String bastidor, String NIF){
        
        this.catalogo1.buscarAlquiler(0);
        
    }
    
    //Metodo para devolver los alquileres que tiene un cliente
    public ArrayList devolverAlquileresDeCliente(String NIF){
        
        //Creamos una nueva lista de tipo alquileres
        ArrayList<Alquileres> listaAlquileres = new ArrayList<>();
        
        String bastidor = "";
        
        //Recorremos la lista de vehiculos 
        for (int i = 0; i < this.catalogo3.getLista().size(); i++) {
                    
            //Hacemos un if para ver si coincide un bastidor del catalogo alquileres
            //con el de vehiculos
            if(this.catalogo1.equals(this.catalogo3.buscarVehiculo(bastidor))){
                
                //Si coincide añadimos la lista con el alquiler que coincide
                listaAlquileres.add(catalogo1.getLista().get(i));
                
            }
            
        }
        
        return listaAlquileres;
        
    }
    
    

}
