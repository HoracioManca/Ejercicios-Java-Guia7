/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Rectángulo;
import java.util.Scanner;

/**
 *
 * @author horac
 */
public class RectánguloService {

    Scanner leer = new Scanner(System.in);

    public Rectángulo crearRectángulo() {
        Rectángulo R1 = new Rectángulo();
        System.out.println("Ingres la base");
        R1.setBase(leer.nextDouble());
        System.out.println("ingrese la altura");
        R1.setAltura(leer.nextDouble());

        return R1;

    }

    public void calcularSuperficie(Rectángulo R1) {

        double superficie = R1.getBase() * R1.getAltura();
        System.out.println("La superficie es: " + superficie);

    }

    public void caluclarPerimetro(Rectángulo R1) {
        double perimetro = (R1.getBase() + R1.getAltura()) * 2;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void dibujarRectangulo(Rectángulo R1) {
        System.out.println("Dibujando el Rectangulo");
        for (int i = 0; i < R1.getBase(); i++) {

            for (int j = 0; j < R1.getAltura(); j++) {
                if ((i == 0 || i == R1.getBase()- 1) || (j == R1.getAltura()-1 || j == 0)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }

      
    }
}
