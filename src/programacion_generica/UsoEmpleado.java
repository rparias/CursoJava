package programacion_generica;

public class UsoEmpleado {
    public static void main(String[] args) {
        Empleado listaEmpleados[] = new Empleado[3];
        listaEmpleados[0] = new Empleado("Ronald", 25, 300);
        listaEmpleados[1] = new Empleado("Gabby", 24, 500);
        listaEmpleados[2] = new Empleado("Erick", 18, 900);

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
