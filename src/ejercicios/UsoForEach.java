package ejercicios;

import javax.swing.*;

/**
 * Creado por Ronald Arias - fecha: 18-dic-16.
 */
public class UsoForEach {
    public static void main (String[] args){
        String[] matrizPaises = new String[8];

        //rellenar matriz con JOptionPane
        for(int i = 0; i<matrizPaises.length; i++){
            matrizPaises[i] = JOptionPane.showInputDialog("Introduce Pais " + (i+1));
        }

        //BUCLE FOR EACH
        System.out.println("----Paises Ingresados----");
        for(String elemento:matrizPaises){
            System.out.println("Pais: " + elemento);
        }
    }
}
