/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;


public class TerminalDeVenta extends Sobremesa {
    


    public TerminalDeVenta(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    
    @Override
    public void conecta(){
        System.out.println("Terminal conectado");
    }

    @Override
    public void desconecta(){
        System.out.println("Terminal desconectado");
    }
}