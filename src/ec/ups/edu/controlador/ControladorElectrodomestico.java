/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.dao.ElectrodomesticoDAO;
import ec.ups.edu.idao.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Electrodomestico;
import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import ec.ups.edu.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author Adolfo
 */
public class ControladorElectrodomestico {

    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private Television tele;
    private Lavadora lava;
    private ElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, ElectrodomesticoDAO dao) {
        this.vista = vista;

        this.dao = dao;
    }

    public void registrarTelevision() {

        modelo = vista.ingresarTelevision();
        dao.crearTelevision((Television) modelo);
    }

    public void registrarLavadora() {
        lava = vista.ingresarLavadora();
        System.out.println(lava);
        dao.crearLavadora(lava);
    }

    public void verLavadoras() {
        List<Lavadora> lista;
        lista = dao.listarLavadora();
        vista.mostrarLavadoras(lista);
    }

    public void verTelevisiones() {
        List<Television> lista;
        lista = dao.listarTelevision();
        vista.mostrarTelevisiones(lista);

    }

}
