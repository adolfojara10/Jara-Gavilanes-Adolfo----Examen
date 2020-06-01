/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author Adolfo
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int codigo) {
        super(codigo);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double pF = super.obtenerPrecioFinal();
        double pB = super.getPrecioBase();
        double pvp = pF + pB;

        if (super.getPeso() > 30) {
            pvp += 50;
        }
        
        return pvp;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nLavadora: \n" + "carga: " + carga + "\nPrecio Final: "
                + this.obtenerPrecioFinal();
    }

}
