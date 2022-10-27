
package Servicio;

import Entidades.Cancion;
import java.util.Scanner;


public class cancionServicio {
    
    public Cancion crearCancion(){
        Scanner leer = new Scanner(System.in);
    Cancion C1 = new Cancion();  
        System.out.println("Ingrese Titulo:");
        C1.setTitulo(leer.next());
        System.out.println("Ingrese Autor:");
        C1.setAutor(leer.next());
    return C1;
    
    
    }
    public void mostrarCancion(Cancion C1){
        System.out.println("Canción: "+C1.getTitulo());
        System.out.println("Autor: "+C1.getAutor());
        
    }
   
    

}
