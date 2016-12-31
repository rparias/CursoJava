package eventosRaton;

import javax.swing.*;
import java.awt.event.*;

/**
 * Creado por Ronald Arias - fecha: 30/12/2016.
 */
public class EventosRaton {
    public static void main(String[] args){
        MarcoRaton miMarco = new MarcoRaton();
    }
}

class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setTitle("Eventos con raton");
        setBounds(600, 300, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //instancia del objeto oyente
        EventosDeRaton raton = new EventosDeRaton();
        addMouseListener(raton);

        //instancia del objeto oyente de movimiento de mouse
        EventoRatonMov ratonMov = new EventoRatonMov();
        addMouseMotionListener(ratonMov);
    }
}

//-----CLASE OYENTE-----//
/*
class EventosDeRaton implements MouseListener{
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de soltar");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar al marco");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir del marco");
    }
}*/

//-----CLASE OYENTE CON ADAPTER-----//
class EventosDeRaton extends MouseAdapter{
    public void mouseClicked(MouseEvent e) {
        //System.out.println("Has hecho clic");
        System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
        System.out.println("Total de clics: " + e.getClickCount());
    }

    public void mousePressed(MouseEvent e) {
        //para saber que boton se presiono
        if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Has pulsado boton izquierdo");
        }else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Has pulsado la rueda del raton");
        }else{
            System.out.println("Has pulsado el boton derecho");
        }
    }
}

//-----CLASE OYENTE PARA MOVIMIENTO DEL RATON------//
class EventoRatonMov implements MouseMotionListener{
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el raton");
    }
}