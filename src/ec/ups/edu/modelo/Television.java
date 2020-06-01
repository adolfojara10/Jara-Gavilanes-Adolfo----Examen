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
public class Television extends Electrodomestico {

    private int resolucion;
    private boolean puertoHDMI;

    public Television(int codigo) {
        super(codigo);
    }

    public Television() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public double obtenerPrecioFinal() {
        double pvp = super.obtenerPrecioFinal();
        double pB = super.getPrecioBase();

        pvp += pB;
        
        if(this.resolucion>40){
            pvp += (pvp*0.3);
        }
        
        if (this.puertoHDMI == true){
            pvp += 50;
        }
        
        return pvp;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nTelevision:\n" + "resolucion: "
                + resolucion + ", puertoHDMI: " + puertoHDMI + "\nPrecio Final: "
                + this.obtenerPrecioFinal();
    }

}
