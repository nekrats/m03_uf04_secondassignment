/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exercicilliure;

import java.util.ArrayList;
/**
 *
 * @author pep
 * 
 * Implementa una ejercicio original con:
 * 
 * Herencia
 * 
 * Polimorfismo
 * 
 * Intefaces
 * 
 * Propiedades, etc.
 * 
 * 
 * Opcionalmente, usa este ejemplo para tu desarrollo.
 * 
 * Fecha limite entrega Domingo 25 a las 12 de la noche.
 * 
 * 
 * No olvides implementar y verificar checkout()
 * 
 */
public class CarritoDeLaCompra implements Finalizable {
    
    private ArrayList<Detalle> carrito = new ArrayList<>();
    
    
    public void afegir(Detalle detalle) { //he modificado el nombre debido a que con la "ñ" de añade me daba fallo
        carrito.add(detalle);
    }
    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
    }

    @Override
    public double checkout() {
        
        //inicializamos la variable donde almacenaremos el precio total de los articulos
        double precioCompra=0;
        //añadimos un pequeño Sysout con el fin de hacer el codigo mas bonito
        System.out.println("Carro de la compra: ");

        //utilizamos un for para recorrer el ArrayList
        for(int i = 0; i<carrito.size(); i++){

            //pedimos que nos muestre el toString combinados de la clase Detalle e Item.
            System.out.println(carrito.get(i).toString());
            
            //cogemos el getPrecio de los hijos de la clase Item para sumarlos en una variable
            //ademas de que aprovechamos para multiplicarlo por la cantidad de items que le pasamos
            precioCompra += (carrito.get(i).getItem().getPrecio())*(carrito.get(i).getCantidad());

        }
    return precioCompra;
    }

}
