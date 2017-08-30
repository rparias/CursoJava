package colecciones;

public class Cliente {
    private String nombre;
    private String numeroCuenta;
    private double saldo;

    public Cliente(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //sobreescribo los metodos para diferenciar por numero de cuenta
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return numeroCuenta != null ? numeroCuenta.equals(cliente.numeroCuenta) : cliente.numeroCuenta == null;
    }

    @Override
    public int hashCode() {
        return numeroCuenta != null ? numeroCuenta.hashCode() : 0;
    }
}
