/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.controlador.ControladorElectrodomestico;
import ec.ups.edu.dao.ElectrodomesticoDAO;
import ec.ups.edu.idao.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Electrodomestico;
import ec.ups.edu.vista.VistaElectrodomestico;

/**
 *
 * @author Adolfo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        VistaElectrodomestico vista = new VistaElectrodomestico();
        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();
        Electrodomestico modelo = new Electrodomestico();

        ControladorElectrodomestico controlador = new ControladorElectrodomestico(vista, dao);

        controlador.registrarTelevision();
        controlador.registrarTelevision();
        controlador.registrarTelevision();
      
        controlador.registrarLavadora();
        controlador.registrarLavadora();
        //controlador.registrarLavadora();
        
        controlador.verTelevisiones();
        
        controlador.verLavadoras();
        
        
        
    }

}
