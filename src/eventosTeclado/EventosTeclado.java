package eventosTeclado;

import javax.swing.*;

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
    }
}
