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
public class Bolsa {
    private ArrayList<Productos> bolsa = new ArrayList<>();
    private final double DESCUENTOPACK = 1.5;
    
    public Bolsa(ArrayList<Productos> bolsa){
        this.bolsa = bolsa;
    }

    public ArrayList<Productos> getBolsa() {
        return bolsa;
    }

    public void setBolsa(ArrayList<Productos> bolsa) {
        this.bolsa = bolsa;
    }
    
    public void pintarBolsa(){
        System.out.println("El contenido de la bolsa es: ");
        for(Productos i : this.bolsa){
            System.out.println("\t "+i.getNombreP()+": "+i.getPrecio()+"€");
        }
        System.out.println("");
    }
    
    public double calcularPack(){
        double totalPack=0;
        for(Productos i : this.bolsa){
            totalPack += i.getPrecio();
        }
        return totalPack;
    }
    
    public double aplicarDescuento(){
        return calcularPack() - this.DESCUENTOPACK;
    }
}
