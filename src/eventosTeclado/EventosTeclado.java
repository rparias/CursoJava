package eventosTeclado;

import javax.swing.*;
import java.awt.event.*;

/**
 * Creado por Ronald Arias - fecha: 30-dic-16.
 */
public class EventosTeclado {
    public static void main(String[] args){
        MarcoTeclado miMarco = new MarcoTeclado();
    }
}

class MarcoTeclado extends JFrame{
    public MarcoTeclado(){
        setVisible(true);
        setTitle("Eventos de teclado");
        setBounds(600, 300, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //instancia del oyente
        EventoDeTeclado tecla = new EventoDeTeclado();
        addKeyListener(tecla);

    }
}

//-----CLASE DEL OBJETO OYENTE-----//
class EventoDeTeclado implements KeyListener{
    //metodos de la interfaz
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println("La tecla presionada es: " + letra);
    }
    public void keyPressed(KeyEvent e) {
        int codigo = e.getKeyCode();
        System.out.println("Codigo: " + codigo);
    }
    public void keyReleased(KeyEvent e) {}
}