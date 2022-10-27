
package guia7_ejercicio08;

import Entidades.Cadena;
import Service.CadenaService;
import java.util.Scanner;

public class Guia7_Ejercicio08 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   Cadena frase1 = new Cadena();
        System.out.println("Ingrese un frase");
        frase1.setFrase(leer.next());
        
      
       CadenaService C1 = new CadenaService();
       C1.contarVocales(frase1);
       C1.invertirFrase(frase1);
      
       System.out.println("Ingrese un letra para ver cuantas veces se repite");
       String caracter = leer.next();
       C1.caracterRepetido(frase1,caracter);
       
       System.out.println("Ingrese nueva frase para comparar la lungitud");
       String frase2 = leer.next();
       C1.compraraLongitud(frase1, frase2);
       
       System.out.println("Ingrese una nueva frase para unir");
       String fraseN = leer.next();
       C1.unirFrases(frase1, fraseN);
       
       System.out.println("Ingrese un caracter para reeplazar por las letras 'a'");
       String letra = leer.next();
       C1.reemplazar(frase1, letra);
       
        System.out.println("Ingrese un letra para para verificar si está en la frase");
       String letra1 = leer.next();
       if (C1.contiene(frase1, letra1)){
           System.out.println("La frase contiene la letra: "+letra1);
        
    }else 
            System.out.println("la frase NO contiene la letra: "+letra1);
      
          
    }
    
}
