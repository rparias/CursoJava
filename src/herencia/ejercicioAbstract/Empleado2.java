package herencia.ejercicioAbstract;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public class Empleado2 extends Persona{

    private static int idSiguiente;
    private int id;
    private double sueldo;
    private Date fechaAlta;

    //CONSTRUCTOR
    public Empleado2(String nombre, double sueldo, int anio, int mes, int dia){
        super(nombre);
        this.sueldo = sueldo;
        GregorianCalendar fecha = new GregorianCalendar(anio, mes-1, dia);  //mes-1 porque enero es cero
        this.fechaAlta = fecha.getTime();
        ++idSiguiente;
        id = idSiguiente;
    }

    //GETTER Y SETTER
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public static void setIdSiguiente(int idSiguiente) {
        Empleado2.idSiguiente = idSiguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //METODOS

    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;  //+= incrementa y asigna
    }

    //METODO REESCRITO DE dameDescripcion ABSTRACT
    public String dameDescripcion(){
        return "Este empleado tiene un id = "+getId()+" con un sueldo de "+getSueldo();
    }
}