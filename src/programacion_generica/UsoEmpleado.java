package programacion_generica;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        //para ahorrar recursos de memoria puedo definir el tamaño del arrayList si es q lo sé
        //listaEmpleados.ensureCapacity(4);

        listaEmpleados.add(new Empleado("Ronald", 25, 300));
        listaEmpleados.add(new Empleado("Gabby", 24, 500));
        listaEmpleados.add(new Empleado("Erick", 18, 900));
        listaEmpleados.add(new Empleado("Noemi", 53, 600));

        //cambia un empleado en una posicion especifica
        listaEmpleados.set(2, new Empleado("Jose", 47, 800));

        //para ahorrar un exceso de memoria, se puede cerrar el arrayList si no se agregan mas elementos
        listaEmpleados.trimToSize();

        //imprimir un empleado de una posicion especifica
        System.out.println("Empleado en posicion 3: " + listaEmpleados.get(2).getDatos());

        System.out.println("Elementos en total: " + listaEmpleados.size());

        //iterator para recorrer el arrayList
        Iterator<Empleado> iterador = listaEmpleados.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next().getDatos());
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
