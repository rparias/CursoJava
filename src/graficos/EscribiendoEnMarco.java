package graficos;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por Ronald Arias - fecha: 17-dic-16.
 */
public class EscribiendoEnMarco {
    public static void main (String[] args){
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Titulo de la ventana");

        //incluir lamina del tipo Lamina
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

//lamina o panel para dibujar encima del frame
class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        //llama al metodo de la clase component para que haga su trabajo
        super.paintComponent(g);

        //le dice que escriba este texto
        g.drawString("Estamos aprendiendo swing", 100, 100);
    }
}