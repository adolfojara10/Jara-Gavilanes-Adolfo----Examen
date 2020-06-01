/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.dao;

import ec.ups.edu.idao.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Electrodomestico;
import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.util.HashSet;
import java.util.List;
import java.util.*;

/**
 *
 * @author Adolfo
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {

    private Set<Electrodomestico> lista;
    private List<Television> listaT;
    private List<Lavadora> listaL;

    public ElectrodomesticoDAO() {
        lista = new HashSet<Electrodomestico>();
        listaT = new ArrayList<>();
        listaL = new ArrayList<>();
    }

    @Override
    public void crearTelevision(Television television) {
        lista.add(television);
        
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);

    }

    @Override
    public List<Lavadora> listarLavadora() {
        Iterator<Electrodomestico> it = lista.iterator();
        
        
        
        while (it.hasNext()) {
            Electrodomestico elec = it.next();
            if (elec instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) elec;
                listaL.add(lavadora);
            }
        }
        
        for(int i=0;i<(listaL.size()-1);i++){
            
            for(int j = 0;j<listaL.size();j++){
                if(listaL.get(i).compareTo(listaL.get(j)) >0){
                    Lavadora la = listaL.get(i);
                    listaL.add(i, listaL.get(j));
                    listaL.add(j, la);
                }
            }
        }
        
        return listaL;
    }

    @Override
    public List<Television> listarTelevision() {
        Iterator<Electrodomestico> it = lista.iterator();
        while (it.hasNext()) {
            Electrodomestico elec = it.next();
            if (elec instanceof Television) {
                Television television = (Television) elec;
                listaT.add(television);
            }
        }
        
        for(int i=0;i<(listaT.size()-1);i++){
            
            for(int j = 0;j<listaT.size();j++){
                if(listaT.get(i).compareTo(listaT.get(j)) >0){
                    Television te = listaT.get(i);
                    listaT.add(i, listaT.get(j));
                    listaT.add(j, te);
                } 
            }
        }

        return listaT;
    }

}
