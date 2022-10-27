/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extra04;

import Entidades.NIF;
import Servivio.NIFServicio;

/**
 *
 * @author horac
 */
public class Guia7_Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        NIFServicio CreaNif = new NIFServicio();
        NIF NIFnuevo = CreaNif.crearNif();
      CreaNif.mostrarNif(NIFnuevo);
    }
    
}
