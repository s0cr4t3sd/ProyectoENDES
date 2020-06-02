/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author moral
 */
public class Pedidos {
    private Bolsa b;    
    
    public Pedidos(){
        
    }

    public Bolsa getB() {
        return b;
    }

    public void setB(Bolsa b) {
        this.b = b;
    }

    public Bolsa bolsa1(){
        ArrayList<Productos> lista = new ArrayList<>();
        lista.add(Productos.BOLSACHUCHES);
        lista.add(Productos.REDBULL);
        lista.add(Productos.COCACOLA);
        lista.add(Productos.BARRASPAN);
        lista.add(Productos.OXIGENOACTIVO);
        lista.add(Productos.LAYS);
        lista.add(Productos.MONSTER);
        
        this.b = new Bolsa(lista);
        return this.b;
    }
    
    public Bolsa bolsa2(){
        ArrayList<Productos> lista = new ArrayList<>();
        lista.add(Productos.PATATASFRITAS);
        lista.add(Productos.PACKCOCACOLA);
        lista.add(Productos.PAPADELTA);
        lista.add(Productos.RISI);
        lista.add(Productos.MEDIANOCHES);
        
        this.b = new Bolsa(lista);
        return this.b;
    }
    
    public Bolsa bolsa3(){
        ArrayList<Productos> lista = new ArrayList<>();
        lista.add(Productos.PATATASFRITAS);
        lista.add(Productos.PACKCOCACOLA);
        lista.add(Productos.DONUTS);
        lista.add(Productos.PALOMITASKETCHUP);
        lista.add(Productos.JUDIASLATA);
        lista.add(Productos.AZUCAR);
        
        this.b = new Bolsa(lista);
        return this.b;
    }
    
    public Bolsa bolsa4(){
        ArrayList<Productos> lista = new ArrayList<>();
        lista.add(Productos.PACKCOCACOLA);
        lista.add(Productos.BOLSACHUCHES);
        lista.add(Productos.REDBULL);
        lista.add(Productos.COCACOLA);
        lista.add(Productos.BARRASPAN);
        lista.add(Productos.OXIGENOACTIVO);
        lista.add(Productos.LAYS);
        
        this.b = new Bolsa(lista);
        return this.b;
    }
    
    public Bolsa bolsa5(){
        Scanner scn = new Scanner(System.in);
        ArrayList<Productos> lista = new ArrayList<>();
        ArrayList<Productos> lBolsa = new ArrayList<>();
        boolean salir = false;
        int selec;
        
        for (Productos i : Productos.values()) { 
            lista.add(i);
        }
        
        while(!salir){
            try{
                System.out.println("PARA SALIR PON 22\n\n");
                this.menuSeleccion();                
                System.out.println("Dime que producto quiere añadir a la bolsa ");
                selec = scn.nextInt();
                if(selec == 22){
                    salir = true;
                }else{
                    if(selec < lista.size()){
                        lBolsa.add(lista.get(selec));
                    }else{
                        System.out.println("Seleccion incorrecta, por favor intentalo de nuevo\n");
                    }                
                }                
            }catch (InputMismatchException ime){
                scn.nextLine();
            }            
        }

        
        this.b = new Bolsa(lBolsa);
        return this.b;
    }       
    
    private void menuSeleccion(){
        int cont = 0;
        for (Productos i : Productos.values()) { 
            System.out.println(cont+") "+i.getNombreP()); 
            cont++;
        }
    }
}
