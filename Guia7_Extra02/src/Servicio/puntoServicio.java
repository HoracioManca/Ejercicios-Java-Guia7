package Servicio;


import entidades.Puntos;
import java.util.Scanner;


public class puntoServicio {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos P1 = new Puntos();
        System.out.println("Ingres las cordenadas para crear el primer punto");
        P1.setX1(leer.nextInt());
        P1.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas para el segundo punto");
        P1.setX2(leer.nextInt());
        P1.setY2(leer.nextInt());
        
        return P1;
    }
    public void calcularDistancia(Puntos P1){
    
        double distancia;
        distancia = (double)Math.sqrt(Math.pow(P1.getX2()-(P1.getX1()), 2)+Math.pow(P1.getY2()-(P1.getY1()), 2));
        System.out.println("La distancia entre punto 1 y punto 2 es: " +distancia);
}
}
