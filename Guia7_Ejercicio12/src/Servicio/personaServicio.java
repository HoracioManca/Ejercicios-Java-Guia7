
package Servicio;

import Entidades.Persona;
import java.util.*;

public class personaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   /* Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    Persona P1= new Persona();
    public Persona  crearPersona(){
      
        System.out.println("Ingrese Nombre:"); P1.setNombre(leer.next());
        System.out.println("Ingrese fecha nacimiento: dia, mes y año ");
        int dia =leer.nextInt();
        int mes = leer.nextInt();
        int anio= leer.nextInt();
        Date FechaNac = new Date(anio-1900,mes-1,dia);
        P1.setFechaNac(FechaNac);
        return P1;
       }
   /* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
   */
    public void  calcularEdad(){
        Date FechaActual= new Date();
        int edad = FechaActual.getYear()- P1.getFechaNac().getYear();
        int mes1= FechaActual.getMonth()- P1.getFechaNac().getMonth();
        int dia1 =FechaActual.getDay()-P1.getFechaNac().getDay();
        if (mes1<0 || dia1<FechaActual.getDay())
            edad--;
        System.out.println("Edad: "+edad+ " años");
    
    }
   /* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
*/
    public boolean menorQue(int otraEdad){
        Date FechaActual= new Date();
       boolean menor =otraEdad< FechaActual.getYear()- P1.getFechaNac().getYear();
      
        
            return menor;
    }
   /* Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior*/
    public void mostrarPersona(){
        
        System.out.println("Nombre: "+P1.getNombre());
        System.out.println("Fecha de nacimiento: "+ P1.getFechaNac());
        
    }
}
