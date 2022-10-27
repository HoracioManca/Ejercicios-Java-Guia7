/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author horac
 */
public class CuentaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario

    public Cuenta crearCuenta() {
        Cuenta C1 = new Cuenta();
        System.out.println("Ingrese Nombre para el titular de la cuenta");
        C1.setNombreCliente(leer.next());
        System.out.println("Ingrese DNI");
        C1.setDNI(leer.nextLong());
        System.out.println("Ingrese Numero de Cuenta");
        C1.setNumeroCuenta(leer.nextInt());
        return C1;
    }
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual

    public void ingreserDinero(Cuenta C1) {
        System.out.println("Ingrese el monto");
        int ingreso = leer.nextInt();
        C1.setSaldo(C1.getSaldo() + ingreso);

    }

    public void retirarDinero(Cuenta C1) {
        System.out.println("Ingrese el monto a retirar");
        int retiro = leer.nextInt();
        if (C1.getSaldo() > retiro) {
            C1.setSaldo(C1.getSaldo() - retiro);
            System.out.println("retiro exitoso");
            System.out.println("saldo actual: " + C1.getSaldo());
        } else {
            System.out.println("Retiraste " + retiro + "y tu saldo actual es 0");
            C1.setSaldo(0);
        }
    }

    public void extraccionRapida(Cuenta C1) {
        System.out.println("Ingrese el monto a extraer");
        int extraccion = leer.nextInt();
        boolean flag=true;
        do {
            if (extraccion > (C1.getSaldo() * 0.2)) {
                 System.out.println("El monto solicitado excede el límite, Ingrese un monto menor");
                 extraccion = leer.nextInt();
            } else {
                 C1.setSaldo(C1.getSaldo() - extraccion);
                System.out.println("Retiraste: "+extraccion);
                System.out.println("Tu saldo actual es:" +C1.getSaldo());
                flag =false;
              
            }
         

        } while (flag ==true);
    }

    public void consultarSaldo(Cuenta C1) {
        System.out.println("Saldo actual: " + C1.getSaldo());
    }

    public void consultaDatos(Cuenta C1) {
        System.out.println(C1);
    }

}
