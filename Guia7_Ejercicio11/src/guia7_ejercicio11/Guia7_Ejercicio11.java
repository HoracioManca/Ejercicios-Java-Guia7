/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();
*/


package guia7_ejercicio11;

import java.util.*;


public class Guia7_Ejercicio11 {

    public static void main(String[] args) {
      Date fechaActual = new Date();
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int dia,mes,anio;
        System.out.println("Ingrese dia: "); dia = leer.nextInt();
        System.out.println("Ingrese mes: "); mes = leer.nextInt()-1;
        System.out.println("Ingrese año: "); anio = leer.nextInt()-1900;
        Date fechaIngresada = new Date(anio,mes,dia);
        System.out.println("fecha ingresada:"+fechaIngresada.toString());
        System.out.println("Fecha Actual: " +fechaActual.toString());
        int diferenciaAnios =fechaActual.getYear()-fechaIngresada.getYear();
        
       
        if (diferenciaAnios>0){
            Math.abs(diferenciaAnios);
              System.out.println("Hay: "+diferenciaAnios+ " años de diferencia");
        }else {
        int dif =fechaIngresada.getYear()-fechaActual.getYear();
        System.out.println("La fecha es futura y hay: "+dif +" años de diferencia");
        }
    }
    
}
