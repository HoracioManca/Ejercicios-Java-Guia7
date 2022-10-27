/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author horac
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  Persona nuevaPersona = new Persona();
    public Persona crearPersona() {
      
        System.out.println("Ingrese nombre:");
        nuevaPersona.setNombre(leer.next());
        System.out.println("Ingrese edad:");
        nuevaPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo: ");
        System.out.println("H = Hombre, M = Mujer, O = Otro");
        nuevaPersona.setSexo(leer.next());
        if (nuevaPersona.getSexo().equalsIgnoreCase("H") || nuevaPersona.getSexo().equalsIgnoreCase("M") || nuevaPersona.getSexo().equalsIgnoreCase("O")) {

        } else {
            System.out.println("La opción ingresada no existe");
            System.out.println("Ingres una opción válida");
            nuevaPersona.setSexo(leer.next());

        }
        System.out.println("Ingres peso:");
        nuevaPersona.setPeso(leer.nextInt());
        System.out.println("Ingres estatura:");
        nuevaPersona.setEstatura(leer.nextDouble());
        return nuevaPersona;

    }
    public double calularIMC(){
        double IMC=0;
        double calculoIMC = nuevaPersona.getPeso()/(nuevaPersona.getEstatura()*nuevaPersona.getEstatura());
        System.out.println("IMC: "+ calculoIMC);
        if(calculoIMC<20){
            IMC = -1;
            System.out.println("IMC: "+IMC +", la persona esá por debajo de su peso ideal");
       
        }else if(calculoIMC>=20 && calculoIMC<=25){
            IMC=0;
            System.out.println("IMC: "+IMC +", la persona esá en su peso ideal");
        }else if(calculoIMC>25){
        IMC=1;
        System.out.println("IMC: "+IMC +", la persona tiene sobrepeso");
    }
       return IMC; 
        
    }
    public boolean mayorEdad(){
       boolean mayor;
        if(nuevaPersona.getEdad()>=18){
            mayor = true;
            System.out.println("es Mayor");
        }else {
        mayor=false;
        System.out.println("es menor");
        }
        return mayor;
    }
}
