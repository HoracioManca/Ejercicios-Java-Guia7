/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
 */
package Entidades;


public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private String nombreCliente;
    private int saldo;
    

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, String nombreCliente, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + '}';
    }
    
    
}
