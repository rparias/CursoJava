package clasesInternas;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.Timer;


/**
 * Creado por Ronald Arias - fecha: 23-dic-16.
 */
public class UsoTemporizador {
    public static void main (String[] args){

        Reloj miReloj = new Reloj(3000, true);
        miReloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para salir");
        System.exit(0);

    }
}


//--------------CLASE RELOJ------------
class Reloj{

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    //metodos
    public void enMarcha(){
        ActionListener oyente = new Hora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }

    /*Clase interna HORA dentro de la clase RELOJ*/
    //siempre que es interna es private
    private class Hora implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("La hora cada 3 segundos: "+ahora);

            if(sonido){     //sonido es encapsulada de clase Reloj, se accede por la clase interna
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
