package programacion_generica.clases_propias;

public class HerenciaGenericos {
    public static void main(String[] args) {
        //por herencia tradicional seria asi:

        /*Empleado administrativa = new Empleado("Elena", 45, 1500);
        Administrador directoraComercial = new Administrador("Ana", 27, 3500);
        Empleado nuevoEmpleado = directoraComercial;*/


        //por herencia en clases genericas se maneja diferente
        //no se puede pasar un jefe como empleado a Pareja
        //para eso se usan los tipos comodin en la definicion del metodo
        //imprimirTrabajador en la clase Pareja, de la siguiente forma
        //en el parametro: (Pareja <? extends Empleado> p)

        Pareja<Empleado> administrativa = new Pareja<Empleado>();
        Pareja<Jefe> directoraComercial = new Pareja<Jefe>();

        //ahora si puedo pasar jefe o empleado a Pareja

        Pareja.imprimirTrabajador(administrativa);
        Pareja.imprimirTrabajador(directoraComercial);
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

//---------------------------------------------
class Jefe extends Empleado{
    public Jefe(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    public double incentivo(double inc){
        return inc;
    }
}