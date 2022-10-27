package guia7_ejercicio12;

import Entidades.Persona;
import Servicio.personaServicio;
import java.util.Scanner;

public class Guia7_Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        personaServicio PS = new personaServicio();
       Persona P1 = PS.crearPersona();
        System.out.println("Ingrese la edad para comparar");
        int otraEdad = leer.nextInt();
        
        System.out.println("------------------------------");
        PS.mostrarPersona();
        PS.calcularEdad();
        if (PS.menorQue(otraEdad)){
        System.out.println("La persana tiene mas de:" + otraEdad + " años");
        }else 
            System.out.println("La es menor a: "+otraEdad+ " años");
                       
    }

}
