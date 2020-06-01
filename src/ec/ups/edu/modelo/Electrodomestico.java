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
public class Electrodomestico implements Comparable<Electrodomestico> {

    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /*
    public int getPrecioFinal() {
        return precioFinal;
    }

    
    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }*/

    public double obtenerPrecioFinal() {
        int precioFinal = 0;
        char con = consumoEnergetico;
        String comparar = "ABCDEF";

        if (comparar.charAt(0) == con) {
            precioFinal += 100;
        } else if (comparar.charAt(1) == con) {
            precioFinal += 80;
        } else if (comparar.charAt(2) == con) {
            precioFinal += 60;
        } else if (comparar.charAt(3) == con) {
            precioFinal += 50;
        } else if (comparar.charAt(4) == con) {
            precioFinal += 30;
        } else if (comparar.charAt(5) == con) {
            precioFinal += 10;
        }

        int pe = peso;

        if (pe > 0 && pe < 20) {
            precioFinal += 10;
        } else if (pe > 20 && pe < 50) {
            precioFinal += 50;
        } else if (pe > 50 && pe < 80) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }

    @Override
    public int compareTo(Electrodomestico o) {       
       
        return (int) (this.precioBase-o.precioBase);
    }

    @Override
    public String toString() {
        return "\nElectrodomestico:\n" + "codigo: " + codigo + ", descripcion: "
                + descripcion + ", precioBase: " + precioBase + ", color: "
                + color + ", consumoEnergetico: " + consumoEnergetico
                + ", peso: " + peso;
    }

    

}
