
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServ {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
   Ahorcado juego1 = new Ahorcado();
   
    public void crearJuego(){
        
        System.out.println("Ingrese una palabra");
        
        String palabra1= leer.next();
       juego1.setVectorPalabra(palabra1.toCharArray());
      
          
           System.out.println("Ingrese cantidad de vidas");
           juego1.setVidas(leer.nextInt());
           juego1.setLetrasEncontradas(0);
        }
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    //buscar como se usa el vector.length.
    public void longitud(){
        System.out.println("la longitud de la palabra es: "+juego1.getVectorPalabra().length);
    }
    
    
    
    //Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    //letra ingresada es parte de la palabra o no. También informará si la letra estaba o no
    public boolean buscar(String letra){
        boolean flag= false;
       char[] vector = juego1.getVectorPalabra();
        for (int i = 0; i < juego1.getVectorPalabra().length; i++) {
            if (vector[i]==letra.charAt(0)){
                juego1.setLetrasEncontradas(juego1.getLetrasEncontradas()+1);
               
                flag = true;
                
            }
                
              
            
        }
        return flag;
    }
    
    //Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    //cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    //devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    //busque una letra que no esté, se le restará uno a sus oportunidades
        public void encontradas(String letra){
            System.out.println("letras encontradas: "+juego1.getLetrasEncontradas()+" de : "+juego1.getVectorPalabra().length);
            for (int i = 0; i < 10; i++) {
                
            }
    }
        //Método intentos(): para mostrar cuantas oportunidades le queda al jugador
        public void intentos(){
            System.out.println("le quedan: " +juego1.getVidas()+" intentos");
        }
         // Método juego(): el método juego se encargará de llamar todos los métodos
    //previamente mencionados e informará cuando el usuario descubra toda la palabra o
    //se quede sin intentos. Este método se llamará en el main.
     public void juego(){
         crearJuego();
         longitud();
         do {
             System.out.println("===========================================");
             System.out.println("Ingrese un letra");
             String letra=leer.next();
             if (buscar(letra)) {
                 System.out.println("Letra encontrada");
                 
             }else{
                    System.out.println("Letra NO enconcrada");
             juego1.setVidas(juego1.getVidas()-1);
             intentos();
                 
             }
             //juego1.getLetrasEncontradas();
             //juego1.getVidas();
             encontradas(letra);
             intentos();
             if (juego1.getLetrasEncontradas()== juego1.getVectorPalabra().length) {
                 String palabra = new String (juego1.getVectorPalabra());
                 System.out.println("Encontraste la palabra: "+palabra);
                 System.out.println("Ganaste!! ");
                 juego1.setVidas(0);
             }else if(juego1.getVidas()==0) {
                 System.out.println("AHORCADO ");
                 
             }
             
             
         } while (juego1.getVidas()!=0);
        
     }  
    }
