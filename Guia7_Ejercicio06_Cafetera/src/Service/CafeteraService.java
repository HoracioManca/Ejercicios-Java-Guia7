/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cafetera;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author horac
 */
public class CafeteraService {
    Scanner leer = new Scanner(System.in);
    public Cafetera crearCafetera(){
         Cafetera CF = new Cafetera();
         CF.setCapMaxima(2000);
         return CF;
    }
    public void llenarCafetera( Cafetera CF){
       
        System.out.println("Llenando cafetera...");
        // TimeUnit.SECONDS.sleep(5);
      CF.setCantAtual(CF.getCapMaxima());
        
                
        
    }
    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    
    public void servirTaza(Cafetera CF) {
        System.out.println("Ingres tamaño de taza a servir");
        System.out.println("1 = taza chica 50ml");
        System.out.println("2 = taza mediana 100ml");
        System.out.println("3 = taza grande 250ml");
        int taza= leer.nextInt();
       
        
        
        switch (taza) {
             case 1:
                 if(CF.getCantAtual()<50){
                 System.out.println("Sirviendo cafe...");
                 // TimeUnit.SECONDS.sleep(3);
                     System.out.println("Cafetera vacía..");
                     System.out.println("La taza solo se llenó al "+(CF.getCantAtual()/50)*100 + " %");
                 CF.setCantAtual(0);
                 }else{
                 System.out.println("Sirviendo cafe..."); 
                  //TimeUnit.SECONDS.sleep(3);
                     System.out.println("taza llena");
                 CF.setCantAtual(CF.getCantAtual()-50);
                 }
                     
                 break;
             case 2:
                 if(CF.getCantAtual()<100){
                 System.out.println("Sirviendo cafe...");
                  //TimeUnit.SECONDS.sleep(3);
                     System.out.println("Cafetera vacía..");
                     System.out.println("La taza solo se llenó al "+(CF.getCantAtual()/100)*100 + " %");
                 CF.setCantAtual(0);
                 }else{
                 System.out.println("Sirviendo cafe..."); 
                  //TimeUnit.SECONDS.sleep(3);
                     System.out.println("taza llena");
                 CF.setCantAtual(CF.getCantAtual()-100);
                 }
                     
                 break;
             case 3:
                 if(CF.getCantAtual()<250){
                 System.out.println("Sirviendo cafe...");
                  //TimeUnit.SECONDS.sleep(3);
                
                     System.out.println("Cafetera vacía..");
                     System.out.println("La taza solo se llenó al "+(CF.getCantAtual()/250)*100 + " %");
                 CF.setCantAtual(0);
                 }else{
                 System.out.println("Sirviendo cafe..."); 
                  //TimeUnit.SECONDS.sleep(3);
                     System.out.println("taza llena");
                 CF.setCantAtual(CF.getCantAtual()-250);
                 }
                     
                 break;
                 
                 
         }     
        
            
           
        }
    public void vaciarCafetera(Cafetera CF){
        System.out.println("Vaciandio cafetera...");
         //TimeUnit.SECONDS.sleep(5);
         CF.setCantAtual(0);
    }
    public void agregarCafe(Cafetera CF) {
       
        System.out.println("Ingrese cantidad de cafe a agregar:");
        int café = leer.nextInt();
        System.out.println("añadiendo cafe a la cafetera...");
        // TimeUnit.SECONDS.sleep(5);
        
    }
    
    }
    
    

