/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author horacio
 */
public class Operacion {
    private double n1;
    private double n2;
    Scanner leer = new Scanner(System.in);

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public void crearOperacion(double N1, double N2){
        System.out.println("Ingrese un numero");
        this.n1 = leer.nextDouble();
        System.out.println("Ingrese otro numero");
        this.n2 = leer.nextDouble();
    }
    public double sumar(){
        double suma = n1+n2;
        return suma;
       }
    public double restar(){
        double resta = n1-n2;
        return resta;
        }
    public  double multiplicar(){
        if (n1==0 || n2==0){
       double multiplicar = 0;
            System.out.println("Opercaión invalida uno de los numeros es cero");
            return multiplicar;
        }else {
           double multiplicar= n1*n2;
        
        
        return multiplicar;
         
    }
        
    }
    public double dividir(){
        if (n1==0 || n2==0){
       double dividir = 0;
            System.out.println("Operación inválida uno de los numeros es cero");
            return dividir;
        }else {
           double dividir= n1/n2;
        
        return dividir;
        }
        
    }
        
                
}

