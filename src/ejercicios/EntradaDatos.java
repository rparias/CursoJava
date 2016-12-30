package ejercicios;

import java.util.*;

/**
 * Creado por Ronald Arias - fecha: 17-dic-16.
 */
public class EntradaDatos {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Introduce edad: ");
        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre + " el siguiente año tendras " + (edad+1));
    }
}
