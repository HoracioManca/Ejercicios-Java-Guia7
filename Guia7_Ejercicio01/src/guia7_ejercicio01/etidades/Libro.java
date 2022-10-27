/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio01.etidades;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    

    public Libro crearLibro(){
        Scanner leer = new Scanner (System.in);
        Libro L1= new Libro();
        System.out.println("Ingrese N° ISBN");
       L1.setISBN(leer.nextInt());
        System.out.println("Ingrese Titulo del libro");
       L1.setTitulo(leer.next());
        System.out.println("Ingrese Nombre Autor");
       L1.setAutor(leer.next());
        System.out.println("Ingrese Paginas");
       L1.setPaginas(leer.nextInt());
       return L1;
    }

    public Libro mostraLibro(){
         Libro L1= new Libro();
        System.out.println("Numero ISBN del Libro; " + ISBN);
        System.out.println("Titulo del Libro; " +titulo);
        System.out.println("Nombre del Autor del Libro; " +autor);
        System.out.println("paginas del Libro; " +paginas);
        
        
        return L1;
    }
    
 }
    
   
    

