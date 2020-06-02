/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

/**
 *
 * @author moral
 */
public enum Productos {
    MONSTER("Botella de Monster", 4),
    PATATASFRITAS("bolsa de patatas fritas", 2),
    PACKCOCACOLA("pack de latas de coca-cola", 3),
    PAPADELTA("bolsa de papa-delta", 1),
    RISI("gusanitos RISI", 1.5),
    MEDIANOCHES("paquete de medianoches", 1.5),
    DONUTS("paquete de donuts", 1.5),
    PALOMITASKETCHUP("bolsa de palomitas sabor ketchup", 1.5),
    JUDIASLATA("judías de lata merca-power", 1.5),
    AZUCAR("azúcar", 1.5),
    BOLSACHUCHES("bolsita de chucherías", 2),
    REDBULL("red bull", 2),
    COCACOLA("coca-cola", 1.7),
    BARRASPAN("2 barras de pan", 1),
    OXIGENOACTIVO("botella de oxígeno activo", 2),
    LAYS("lays sabor campesinas", 2);
    
    private String nombreP;
    private double precio;
    private Productos (String nombreP, double precio){
        this.nombreP = nombreP;
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public double getPrecio() {
        return precio;
    }
    
}
