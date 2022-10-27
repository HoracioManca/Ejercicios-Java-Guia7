/*
 * 
 */
package guia7_ejercicio09;

import Entidades.Matematica;
import java.util.*;

public class Guia7_Ejercicio09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica M1 = new Matematica();
        System.out.println("Ingrese 2 numeros");
        M1.setNum1(Math.random() * 100 + 1);
        M1.setNum2(Math.random() * 100 + 1);
        System.out.println("Numero 1: "+M1.getNum1());
        System.out.println("Numero 2: "+M1.getNum2());
        
        System.out.println("El mayor es: " + devolverMayor(M1.getNum1(),M1.getNum2()));
        System.out.println("El numero mayor elvado al menor es; "+ calcularPotencia(M1.getNum1(),M1.getNum2()));
        System.out.println("la raid cuadrad del numero menor es; "+ raizCuadrada(M1.getNum1(),M1.getNum2()));

    
    }
    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public static double devolverMayor(double y, double x) {
   
       return  Math.max(y, x); 
                
}
    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
        //al menor número. Previamente se deben redondear ambos valores
    public static double calcularPotencia(double y, double x){
        double potencia;
        if(y>x){
         potencia= Math.pow(y, x);
        }else {
           potencia= Math.pow(x, y);
        }
        return potencia;
    }
    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    public static double raizCuadrada(double y,double x){
        double raiz;
        if (y<x){
           
         raiz= Math.sqrt(Math.round(y));
         // raiz= Math.sqrt(Math.round(y));
        }else {
             
         raiz= Math.sqrt(Math.round(x));
        }
                
                
        return raiz;
    }
}
