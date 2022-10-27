/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Circunferencia {
     private double radio;

    public Circunferencia() {
    }

       

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
     
    public void creaCircunferencia(double radio){
         this.radio = radio;
         System.out.println("El radio de la circulo es: "+radio);
         
    }
    
    public void areaCircunferencia(){
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area es: "+area);
    }
    public void perimetroCircunferencia(){
        double perimetro = 2* Math.PI * radio;
        System.out.println("El perimetro es: "+perimetro);
    }
}

