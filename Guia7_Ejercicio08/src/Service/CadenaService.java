package Service;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in);

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    //ingresada.
    public void contarVocales(Cadena frase1) {
        String frase = frase1.getFrase().toLowerCase();
        int contVocal = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && frase.charAt(i) != 'u') {
            } else {
                contVocal++;
            }
        }
        System.out.println("La frase contiene: " + contVocal + " vocales");
    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"
    public void invertirFrase(Cadena frase1) {
        String invertida = "";
        for (int i = frase1.getFrase().length() - 1; i >= 0; i--) {
            invertida += frase1.getFrase().charAt(i);

        }
        System.out.println("Frase invertida " + invertida);

    }

    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo
    public void caracterRepetido(Cadena frase1, String caracter) {

        int cont = 0;
        for (int i = 0; i < frase1.getLongitud(); i++) {
            if (caracter.toLowerCase().charAt(0) == frase1.getFrase().toLowerCase().charAt(i)) {
                cont++;

            }
        }
        System.out.println("la letra: " + caracter + "  se repite " + cont);
    }
    // Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    //compone la clase con otra nueva frase ingresada por el usuario

    public void compraraLongitud(Cadena frase1, String frase2) {
        if (frase1.getLongitud() == frase2.length()) {
            System.out.println("las 2 frases tienen la misma longitud: " + frase2.length() + " caracteres");

        } else {
            System.out.println(" las frases NO tienen la misma longitud");
        }
    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    //una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena frase1, String fraseN) {
        String frase3 = frase1.getFrase();
        String espacio = " ";
        frase3 += espacio += fraseN;
        System.out.println("La nueva frase es: " + frase3);
    }
    //  Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    //frase resultante.

    public void reemplazar(Cadena frase1, String letra) {

        System.out.println("reemplazando " + frase1.getFrase().replace("a", letra));
    }
   // Método contiene(String letra), deberá comprobar si la frase contiene una letra que
   //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(Cadena frase1, String letra1){
    
        if (frase1.getFrase().contains(letra1)){
            
        }
    return true;
}
}
