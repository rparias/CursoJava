package temporizador;

import javax.swing.*;


/**
 * Creado por Ronald Arias - fecha: 23-dic-16.
 */
public class PrincipalTemporizador {
    public static void main (String[] args){

        Hora oyente = new Hora();

        Timer miTemporizador = new Timer(5000, oyente); //5000ms = 5 segundos
        //oyente es una Interfaz ActionListener con el metodo actionPerformed(ActionEvent e)

        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

        System.exit(0);


    }
}
