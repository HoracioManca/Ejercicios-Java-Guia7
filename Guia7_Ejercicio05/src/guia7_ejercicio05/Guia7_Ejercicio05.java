/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio05;

import Entidades.Cuenta;
import Service.CuentaService;
import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia7_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaService dinero = new CuentaService();
        Cuenta datos = dinero.crearCuenta();
        boolean flag = true;
        int opcion;
        Scanner leer = new Scanner(System.in);
        while (flag) {
            System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. ingresar saldo\n"
                    + "2. retirar saldo\n"
                    + "3. extraccion rapida\n"
                    + "4. consultar saldo\n"
                    + "5. datos de la cuenta\n"
                    + "6. salir\n");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");

            switch (opcion) {
                case 1:
                    dinero.ingreserDinero(datos);
                    break;
                case 2:
                    dinero.retirarDinero(datos);
                    break;
                case 3:
                    dinero.extraccionRapida(datos);
                    break;
                case 4:
                    dinero.consultarSaldo(datos);
                    break;
                case 5:
                    dinero.consultaDatos(datos);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    flag = false;
                    break;
                default:
                    System.out.println("la opción ingresada no existe");

            }

        }

    }

}
