/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio06_cafetera;

import Entidades.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia7_Ejercicio06_Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer  = new Scanner(System.in);
        
        
        CafeteraService Nexpresso= new CafeteraService();
        Cafetera Nexpesso1 = Nexpresso.crearCafetera();
        boolean flag= true;
        int opción;
        while (flag){
            System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. Servir taza\n"
                    + "2. Llenar cafetera\n"
                    + "3. Vaciar cafetera\n"
                    + "4. Agregar café\n"
                    + "5. salir\n");
                    
            
            System.out.println("-----------------");
            opción = leer.nextInt();
            System.out.println("-----------------");
            switch (opción){
                case 1:
                    Nexpresso.servirTaza(Nexpesso1);
                    break;
                case 2:
                    Nexpresso.llenarCafetera(Nexpesso1);
                break;
                case 3:
                    Nexpresso.vaciarCafetera(Nexpesso1);
                    break;
                case 4:
                    Nexpresso.agregarCafe(Nexpesso1);
                    break;
                case 5:
                    System.out.println("saliendo de sostema Carfetera Nexpresso");
                    flag = false;
                    break;
                default:
                    System.out.println("La opción ingresada no existe");
                
                          
            }
            
            
        }
        
        
    }
    
}
