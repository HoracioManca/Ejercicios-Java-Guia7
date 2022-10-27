/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extra02;

import Servicio.puntoServicio;
import entidades.Puntos;

/**
 *
 * @author horac
 */
public class Guia7_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        puntoServicio Pservicio = new puntoServicio();
        Puntos Puntos1 = Pservicio.crearPuntos();
        Pservicio.calcularDistancia(Puntos1);
        
    }
    
}
