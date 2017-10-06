package herencia.ejercicioEmpleado;

import java.util.Arrays;

/**
 * Creado por Ronald Arias - fecha: 06-oct-17.
 */
public class FechaHerencia {
    public static void main(String[] args){

        Jefe jefeRRHH = new Jefe("Paul", 55000, 1995, 05, 14);
        jefeRRHH.setIncentivo(2570);


        //array para los empleados
        Empleado[] arrayEmpleados = new Empleado[5];
        arrayEmpleados[0] = new Empleado("Ronald", 90000, 1992, 8, 11);
        arrayEmpleados[1] = new Empleado("Gabby", 10000, 1993, 2, 23);
        arrayEmpleados[2] = new Empleado("Erick", 47500, 1999, 6, 21);

        arrayEmpleados[3] = jefeRRHH;   //POLIMORFISMO!!!
        /**POLIMORFISMO O PRINCIPIO DE SUSTITUCION
         * Se puede utilizar un objeto de la subclase(Administrador por ejemplo) siempre
         * que el programa espere un objeto de la superclase(Empleados en este caso)*/

        arrayEmpleados[4] = new Jefe("Maria", 95000, 1999, 05, 26);
        //casting para convertir un objeto
        //se puede castear variables y objetos
        Jefe jefaFinanzas = (Jefe) arrayEmpleados[4];
        jefaFinanzas.setIncentivo(55000);
        System.out.println(jefaFinanzas.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));

        System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de " +jefaFinanzas.establecerBonus(500));
        System.out.println("El empleado " + arrayEmpleados[2].getNombre() + " tiene un bonus de " + arrayEmpleados[2].establecerBonus(200));



        //subir porcentaje a todos
        for(Empleado emp: arrayEmpleados){
            emp.subeSueldo(5);
        }

        //INTERFACES
        //Arrays.sort necesita tener con que comparar
        // Aqui entra la interfaz en Empleado implements Comparable
        //ordena por sueldos, eso se puede modificar en compareTo de Empleado
        Arrays.sort(arrayEmpleados);

        //imprimir con for mejorado
        for(Empleado emp: arrayEmpleados){
            System.out.println("Empleados: " + emp.getNombre() +
                    " -- Sueldo: " + emp.getSueldo() +
                    " -- Fecha de alta: " + emp.getFechaAlta());
        }
        /**En emp se cumple el ENLAZADO DINAMICO, ya que getSueldo a veces llama
         * al de la clase empleado y otras veces al de la clase Administrador, de esta
         * forma se puede ver mejor como funciona el polimorfismo*/
    }
}
