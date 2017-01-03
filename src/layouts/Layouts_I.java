package layouts;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por Ronald Arias - fecha: 02-ene-17.
 */
public class Layouts_I {
    public static void main(String[] args){
        MarcoLayout miMarco = new MarcoLayout();
    }
}

class MarcoLayout extends JFrame{
    public MarcoLayout(){
        setVisible(true);
        setTitle("Layouts en Java");
        setBounds(600, 300, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //instancias
        PanelLayout miLamina = new PanelLayout();
        FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT, 50, 20);   //alinear a la izq con separacion
        miLamina.setLayout(disposicion);
        add(miLamina);
    }
}

class PanelLayout extends JPanel{
    public PanelLayout(){
        add(new JButton("Amarillo"));
        add(new JButton("Azul"));
        add(new JButton("Rojo"));


    }
}