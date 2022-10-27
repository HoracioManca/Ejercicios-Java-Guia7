/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio04;

import Entidades.Rectángulo;
import Service.RectánguloService;

/**
 *
 * @author horac
 */
public class Guia7_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectánguloService RService = new RectánguloService();
        Rectángulo R1 = RService.crearRectángulo(); // aqui estoiy creando el objeto al llamar a metodo crearRectangulo
        RService.calcularSuperficie(R1); // aqui le paso por parametros el objeto R1 para llamar al metodo calcularSuperficie
        RService.caluclarPerimetro(R1);
        RService.dibujarRectangulo(R1);
        
    }
    
}
