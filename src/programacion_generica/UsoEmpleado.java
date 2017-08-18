package programacion_generica;

import java.util.ArrayList;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*Empleado listaEmpleados[] = new Empleado[3];
        listaEmpleados[0] = new Empleado("Ronald", 25, 300);
        listaEmpleados[1] = new Empleado("Gabby", 24, 500);
        listaEmpleados[2] = new Empleado("Erick", 18, 900);*/

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        //para ahorrar recursos de memoria puedo definir el tamaño del arrayList si es q lo sé
        //listaEmpleados.ensureCapacity(4);

        listaEmpleados.add(new Empleado("Ronald", 25, 300));
        listaEmpleados.add(new Empleado("Gabby", 24, 500));
        listaEmpleados.add(new Empleado("Erick", 18, 900));
        listaEmpleados.add(new Empleado("Majo", 21, 600));

        //para ahorrar un exceso de memoria, se puede cerrar el arrayList si no se agregan mas elementos
        listaEmpleados.trimToSize();

        System.out.println("Elementos en total: " + listaEmpleados.size());

        for(Empleado e: listaEmpleados){
            System.out.println(e.getDatos());
        }
    }
}

//---------------------------------------------
class Empleado{

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDatos() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Salario: " + salario;
    }
}
