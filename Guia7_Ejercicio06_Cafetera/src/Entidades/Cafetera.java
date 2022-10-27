/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos
 */
package Entidades;

/**
 *
 * @author horac
 */
public class Cafetera {
    private double capMaxima;
    private double cantAtual;

    public Cafetera() {
    }

    public Cafetera(double capMaxima, double cantAtual) {
        this.capMaxima = capMaxima;
        this.cantAtual = cantAtual;
    }

    public double getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(double capMaxima) {
        this.capMaxima = capMaxima;
    }

    public double getCantAtual() {
        return cantAtual;
    }

    public void setCantAtual(double cantAtual) {
        this.cantAtual = cantAtual;
    }
    
    
    
}
