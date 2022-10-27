/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio07_persona;


import Service.PersonaService;

/**
 *
 * @author horac
 */
public class Guia7_Ejercicio07_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PersonaService P1 = new PersonaService();
        PersonaService P2 = new PersonaService();
        PersonaService P3 = new PersonaService();
        PersonaService P4 = new PersonaService();
        P1.crearPersona();
        double IMC1 = P1.calularIMC();
       
        boolean edad1 = P1.mayorEdad();

        P2.crearPersona();
        double IMC2 = P2.calularIMC();
        boolean edad2 = P2.mayorEdad();

        P3.crearPersona();
        double IMC3 = P3.calularIMC();
        boolean edad3 = P3.mayorEdad();

        P4.crearPersona();
        double IMC4 = P4.calularIMC();
   
        boolean edad4 = P4.mayorEdad();

        //calcular porcentaje IMC
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int personas = 0;
        while (personas < 4) {
            if (IMC1 == 1 || IMC2 == 1 || IMC3 == 1 || IMC4 == 1) {
                cont1++;

            }else if (IMC1 == 0 || IMC2 == 0 || IMC3 == 0 || IMC4 == 0) {
            
                cont2++;
            }else if (IMC1 == -1 || IMC2 == -1 || IMC3 == -1 || IMC4 == -1) {
                cont3++;
            
            }
            personas++;

        }
        System.out.println("Peronas con sobrepeso: " + cont1 / 4 * 100 + "%");
        System.out.println("Peronas por debajo de peso ideal: " + cont3 / 4 * 100 + "%");
        System.out.println("Peronas con peso ideal: " + cont2 / 4 * 100 + "%");
        

        // Calculo porcentaje personas mayores de edad
        int cont4 = 0;
        int cont5 = 0;
        int cant = 0;
        while (cant < 4) {
            if (edad1|| edad2 || edad3 || edad4) {
                cont4++;
            }else  {
            
            cont5++;
            }
            cant++;
            
        }
        System.out.println("Personas mayores: " + cont4 / 4 * 100 + "%");
        System.out.println("Personas menores: " + cont5 / 4 * 100 + "%");

    }
}
