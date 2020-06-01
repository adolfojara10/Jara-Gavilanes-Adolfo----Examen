/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adolfo
 */
public class VistaElectrodomestico {
    
    private Scanner entrada;
    
    public VistaElectrodomestico() {
        entrada = new Scanner(System.in);
    }
    
    public Television ingresarTelevision() {
        
        Television television = new Television();
        
        System.out.println("\nCreacion de una Television: ");
        System.out.println("Codigo: ");
        int codigo = entrada.nextInt();
        television.setCodigo(codigo);
        
        System.out.println("Descripcion: ");
        String descripcion = entrada.next();
        television.setDescripcion(descripcion);
        
        System.out.println("Precio Base: ");
        double precio = entrada.nextDouble();
        television.setPrecioBase(precio);
        
        System.out.println("Color: ");
        String color = entrada.next();
        television.setColor(color);
        
        System.out.println("Consumo energia(escribir en mayusculas): ");
        String consumo = entrada.next();
        char consum = consumo.charAt(0);
        television.setConsumoEnergetico(consum);
        
        System.out.println("Peso: ");
        int peso = entrada.nextInt();
        television.setPeso(peso);
        
        System.out.println("Resolucion: ");
        int resolucion = entrada.nextInt();
        television.setResolucion(resolucion);
        
        System.out.println("Escriba 1 si tiene puertoHDMI y 2 si no lo tiene: ");
        int comprobar = entrada.nextInt();
        boolean puerto = false;
        if (comprobar == 1) {
            puerto = true;
        }
        television.setPuertoHDMI(puerto);
        
        System.out.println(television.toString());
        return television;
    }
    
    public Lavadora ingresarLavadora() {
        Lavadora lavadora = new Lavadora();
        
        System.out.println("\nCreacion de una Lavadora: ");
        System.out.println("Codigo: ");
        int codigo = entrada.nextInt();
        lavadora.setCodigo(codigo);
        
        System.out.println("Descripcion: ");
        String descripcion = entrada.next();
        lavadora.setDescripcion(descripcion);
        
        System.out.println("Precio Base: ");
        double precio = entrada.nextDouble();
        lavadora.setPrecioBase(precio);
        
        System.out.println("Color: ");
        String color = entrada.next();
        lavadora.setColor(color);
        
        System.out.println("Consumo energia(escribir en mayusculas): ");
        String consumo = entrada.next();
        char consum = consumo.charAt(0);
        lavadora.setConsumoEnergetico(consum);
        
        System.out.println("Peso: ");
        int peso = entrada.nextInt();
        lavadora.setPeso(peso);
        
        System.out.println("Carga: ");
        int carga = entrada.nextInt();
        lavadora.setCarga(carga);
        
        return lavadora;
    }
    
    public void mostrarLavadoras(List<Lavadora> lista) {
        System.out.println("\nLavadoras:\n ");
        for(Lavadora lavadora : lista){
            System.out.println(lavadora.toString());
        }
        
    }
    
    public void mostrarTelevisiones(List<Television> lista) {
        System.out.println("\nTelevisiones:\n");
        for(Television television:lista){
            System.out.println(television.toString());
        }
        
    }
    
}
