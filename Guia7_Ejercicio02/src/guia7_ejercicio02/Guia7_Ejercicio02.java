
package guia7_ejercicio02;

import guia7_ejercicio02.entidades.Circunferencia;
import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 * 
 * 
 * 
 */
public class Guia7_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c1 = new Circunferencia(12);
        Scanner leer = new Scanner(System.in);
        System.out.println("El radio original es; " +c1.getRadio());
        c1.setRadio(15);
        System.out.println("El nuevo valor del radio es: "+c1.getRadio());
        
        
        System.out.println("Ingrese Radio");
        //double radio=leer.nextDouble();
        c1.setRadio(leer.nextDouble());
        c1.creaCircunferencia(c1.getRadio());
        c1.areaCircunferencia();
        c1.perimetroCircunferencia();
        
    }
    
}
