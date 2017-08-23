package serializacion;

import java.io.*;
import java.util.*;

public class Serializando {
    public static void main(String[] args) {
        Administrador jefe = new Administrador("Ronald", 3500, 2017, 8, 22);
        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 2500, 2000, 10, 1);
        personal[2] = new Empleado("Juan", 2000, 2005, 11, 13);

        //utilizo las clases para serializar ObjectOutputStream y ObjectInputStream con sus respectivos metodos
        try{
            //direccion donde se guardara el archivo serializado, puede ser cualquiera
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("D:/UDLA/GitHub/CursoJava/src/serializacion/carpeta_guardar/empleado.dat"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();

            //recupero mi archivo con ObjectInputStream
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("D:/UDLA/GitHub/CursoJava/src/serializacion/carpeta_guardar/empleado.dat"));
            Empleado[] personalRecuperado = (Empleado[]) recuperando_fichero.readObject();
            recuperando_fichero.close();

            for(Empleado e : personalRecuperado){
                System.out.println(e);
            }

        }catch (Exception e){

        }
    }
}


//--------------------CLASE EMPLEADO--------------------//
//como se va a serializar un objeto tipo Empleado, debe usar la interfaz Serializable

class Empleado implements Serializable{

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

    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", sueldo=" + sueldo +
                ", fechaAlta=" + fechaAlta;
    }
}


//--------------------CLASE JEFE--------------------//
class Administrador extends Empleado{

    private double incentivo;

    public Administrador(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }

    public double getIncentivo() {
        return incentivo;
    }
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo(){
        double sueldoJefe = super.getSueldo();  //llama al getSueldo del padre
        return sueldoJefe + getIncentivo();
    }

    public String toString(){
        return super.toString() + ", incentivo = "+ incentivo;
    }
}
