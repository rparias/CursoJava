package extras;

import java.util.*;

/**
 * Creado por Ronald Arias - fecha: 01-ene-17.
 */
public class Par {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();

        if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
