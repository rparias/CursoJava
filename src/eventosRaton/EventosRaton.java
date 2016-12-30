package eventosRaton;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
    }
}

//-----CLASE OYENTE-----//
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
}

//-----CLASE OYENTE CON ADAPTER-----//
/*
class EventosDeRaton extends MouseAdapter{
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
    }
}*/