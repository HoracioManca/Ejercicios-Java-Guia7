/** Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
 * los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
 * de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
 * programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
 * un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
 * ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado! */
package guia7_extra05;

import java.util.*;

public class Guia7_Extra05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mes[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[1];
        System.out.println("Adivine el mes secreto, Ingrese un mes en minusculas");
        String mesS = leer.next();
        while (!mesS.equals(mesSecreto)) {
            System.out.println("No ha acertado, intente de nuevo.");
            mesS = leer.next();
        }
        System.out.println("HA ACERTADO");

    }

}
