package herencia.ejercicioEmpleado;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Creado por Ronald Arias - fecha: 06-oct-17.
 */
public class Empleado implements Comparable, InterfazTrabajadores{
    String nombre;
    double sueldo;
    Date fechaAlta;

    //CONSTRUCTOR
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar fecha = new GregorianCalendar(anio, mes-1, dia);  //mes-1 porque enero es cero
        this.fechaAlta = fecha.getTime();
    }

    //GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    //METODOS

    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;  //+= incrementa y asigna
    }


    //METODO COMPARE TO DE LA INTERFAZ
    public int compareTo(Object miObjeto){
        Empleado otroEmpleado = (Empleado) miObjeto;
        if(this.getSueldo() < otroEmpleado.getSueldo()){
            return -1;  //si un sueldo es menor q el otro
        }
        if(this.getSueldo() > otroEmpleado.getSueldo()){
            return 1;
        }
        return 0;
    }

    //METODO DE LA INTERFAZ TRABAJADORES
    public double establecerBonus(double bonus){
        //aqui no hay una prima porque no son jefes
        return InterfazTrabajadores.bonusBase + bonus;
    }
}
