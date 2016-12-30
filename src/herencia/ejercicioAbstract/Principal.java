package herencia.ejercicioAbstract;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public class Principal {
    public static void main (String[] args){

        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Ronald Arias", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Erick Arias", "Negocios internacionales");
        //gracias al polimorfismo puedo tener un array de tipo Persona con objetos de tipo Empleado2 y Alumno

        //imprimir
        for(Persona p: lasPersonas){
            System.out.println(p.getNombre()+", "+p.dameDescripcion());
        }
    }
}
