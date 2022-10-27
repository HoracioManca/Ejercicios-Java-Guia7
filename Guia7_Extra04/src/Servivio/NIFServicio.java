
package Servivio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author horac
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    public NIF crearNif(){
        NIF nuevoNif =new NIF();
        
        System.out.println("Ingrese DNI"); 
        nuevoNif.setDNI(leer.nextLong());
        
        String []vector= {"T" , "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
        for (int i = 0; i < vector.length; i++) {
            long pos = nuevoNif.getDNI()%23;
            if ((int)pos == i){
               nuevoNif.setLetra(vector[i]);
               
            }
        }
        
        return nuevoNif;
    }
    public void mostrarNif(NIF nuevoNif){
        System.out.println("Mostrando DNI+NIF: " + nuevoNif.getDNI()+"-"+nuevoNif.getLetra());
        
    }
}
