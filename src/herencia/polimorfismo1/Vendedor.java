package herencia.polimorfismo1;

import java.util.List;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Vendedor extends Empleados{
    private Coche vehiculo;
    private int telfMovil;
    private String areaVenta;
    private List listaClientes;
    private double porcentajeComision;
    private double incremento;

    //CONSTRUCTOR
    public Vendedor(String nombre, String apellido, int dni, String direccion, int telefono, double salario, Coche vehiculo, int telfMovil, String areaVenta, List listaClientes, double porcentajeComision, double incremento) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.vehiculo = vehiculo;
        this.telfMovil = telfMovil;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        this.porcentajeComision = porcentajeComision;
        this.incremento = 10;
    }

    //GETTERS Y SETTERS
    public Coche getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Coche vehiculo) {
        this.vehiculo = vehiculo;
    }
    public int getTelfMovil() {
        return telfMovil;
    }
    public void setTelfMovil(int telfMovil) {
        this.telfMovil = telfMovil;
    }
    public String getAreaVenta() {
        return areaVenta;
    }
    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }
    public List getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List listaClientes) {
        this.listaClientes = listaClientes;
    }
    public double getPorcentajeComision() {
        return porcentajeComision;
    }
    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    public double getIncremento() {
        return incremento;
    }
    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    //IMPRIMIR
    public void imprimir(){
        super.imprimir();
        System.out.println(" || Vehiculo: "+getVehiculo()+" || Telefono: "+getTelfMovil()+" || Area Venta: "+getAreaVenta()+
                " || Porcentaje comision: "+getPorcentajeComision()+" || Incremento: "+getIncremento()+" || Puesto: Vendedor");
    }
}
