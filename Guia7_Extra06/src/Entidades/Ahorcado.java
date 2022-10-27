/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
 */
package Entidades;

import java.util.logging.Logger;

public class Ahorcado {
    public  char []vectorPalabra;
    public int letrasEncontradas;
    public int vidas;

    public Ahorcado() {
    }

    public Ahorcado(char[] vectorPalabra, int letrasEncontradas, int vidas) {
        this.vectorPalabra = vectorPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.vidas = vidas;
    }

    public char[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(char[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "vectorPalabra=" + vectorPalabra +  '}';
    }

   
    
}