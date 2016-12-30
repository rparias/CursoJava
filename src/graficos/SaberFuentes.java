package graficos;

import java.awt.*;
import javax.swing.*;

/**
 * Creado por Ronald Arias - fecha: 24-dic-16.
 */
public class SaberFuentes {
    public static void main(String[] args){

        String fuente = JOptionPane.showInputDialog("Introduce la fuente:");
        boolean estaLaFuente = false;

        //array para almacenar los tipos de fuentes
        String[] arrayFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String nombreFuente: arrayFuentes){
            if(nombreFuente.equals(fuente)){
                estaLaFuente = true;
            }
        }

        if(estaLaFuente){
            System.out.println("Si esta instalada");
        }else{
            System.out.println("No esta instalada");
        }
    }
}
