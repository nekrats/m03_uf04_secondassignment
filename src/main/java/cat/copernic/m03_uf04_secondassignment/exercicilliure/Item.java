/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

/**
 *
 * @author pep
 * 
 * Producte que volem comprar
 * 
 * precio, descripcion, nombre, id
 * 
 * Se recomienda extender esta clase 
 * 
 * 
 */
public class Item {
    
    private double precio;
    private String descripcion;
    private String nombre;
    private int id;


    public Item(int id, String nombre, String descripcion, double precio){

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public String toString(){
        return ""+nombre+", "+descripcion+". "+ "Id del objeto: "+id+". "+"Precio de la unidad: "+precio+"€";
    }

}
