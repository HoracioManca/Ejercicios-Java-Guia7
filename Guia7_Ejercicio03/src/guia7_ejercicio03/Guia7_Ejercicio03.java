/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio03;

import Entidades.Operacion;

/**
 *
 * @author horac
 */
public class Guia7_Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion O1 = new Operacion();
        O1.crearOperacion(O1.getN1(),O1.getN2());
       
        
        System.out.println("suma: "+ O1.sumar());
        System.out.println("resta: "+ O1.restar());
        System.out.println("multiplicacion: "+ O1.multiplicar());
        System.out.println("division: "+ O1.dividir());

    }
    }
