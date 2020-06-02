/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

import java.util.ArrayList;

/**
 *
 * @author moral
 */
public class Programa {
    public static void main(String[] args) {
        Pedidos p = new Pedidos();
       
        Bolsa bolsa1 = p.bolsa1();
        Bolsa bolsa2 = p.bolsa2();
        Bolsa bolsa3 = p.bolsa3();
        Bolsa bolsa4 = p.bolsa4();        
        Bolsa bolsa5 = p.bolsa5();
       
        System.out.println("");
        bolsa1.pintarBolsa();
        System.out.println("Total1: "+bolsa1.aplicarDescuento()+"€");
        
        System.out.println("");
        bolsa2.pintarBolsa();
        System.out.println("Total2: "+bolsa2.aplicarDescuento()+"€");
        
        System.out.println("");
        bolsa3.pintarBolsa();
        System.out.println("Total3: "+bolsa3.aplicarDescuento()+"€");
        
        System.out.println("");
        bolsa4.pintarBolsa();
        System.out.println("Total4: "+bolsa4.aplicarDescuento()+"€");
        
        System.out.println("");
        bolsa5.pintarBolsa();
        System.out.println("Total5: "+bolsa5.calcularPack()+"€");
    }
}
