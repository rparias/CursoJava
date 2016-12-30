package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 * Creado por Ronald Arias - fecha: 30-dic-16.
 */
public class CambioEstado {
    public static void main(String[] args){
        MarcoEstado miMarco = new MarcoEstado();
    }
}

class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setTitle("Cambio de Estado");
        setBounds(600, 300, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //listener
        CambiaEstado nuevoEstado = new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
}

class CambiaEstado implements WindowStateListener{
    public void windowStateChanged(WindowEvent e){
        //System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState());
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta en pantalla completa");
        }else if(e.getNewState() == Frame.NORMAL){
            System.out.println("La ventana esta normal");
        }else if(e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana esta minimizada");
        }
    }
}
