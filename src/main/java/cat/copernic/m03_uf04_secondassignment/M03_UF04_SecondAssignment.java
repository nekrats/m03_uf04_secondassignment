/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) {
        System.out.println("Hi");

        Dispositivos disp1 = new Ordenador("Asus","Ordenador Gaming",1200);
        disp1.conecta();
        disp1.desconecta();

        Dispositivos disp2 = new TerminalDeVenta("Cajero","Ordenador del Mercadonna",600);
        disp2.conecta();
        disp2.desconecta();

        Dispositivos disp3 = new Tablet("Ipad small", " Tablet de la marca Apple",1500);
        disp3.conecta();
        disp3.desconecta();

        Dispositivos disp4 = new Portatil("Lenovo","Ordenador de empresa",800);
        disp4.conecta();
        disp4.desconecta();


    }

 
    
}
