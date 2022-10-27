/*
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son

 */
package Entidades;


public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double estatura;

    public Persona() { // metodo contructor por defecto
    }
    public Persona(String nombre,int edad, String sexo, double peso, double estatura){//metodo constructor por parametros
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.estatura=estatura;
                
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
    
    
    
    
    
}
