/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.idao;

import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.util.*;

/**
 *
 * @author Adolfo
 */
public interface IElectrodomesticoDAO {
    
    public void crearTelevision(Television television);
    public void crearLavadora(Lavadora lavadora);
    public List<Lavadora> listarLavadora();
    public List<Television> listarTelevision();
    
}
