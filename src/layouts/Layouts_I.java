package layouts;

import javax.swing.*;
import javax.swing.border.Border;
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
        PanelLayout2 miLamina2 = new PanelLayout2();
        add(miLamina, BorderLayout.NORTH);
        add(miLamina2, BorderLayout.SOUTH);
    }
}
    //-----LAMINA PARA BOTONES CON FLOWLAYOUT-----//
class PanelLayout extends JPanel{
    public PanelLayout(){

        /*con FlowLayout para Alinear*/
        setLayout(new FlowLayout(FlowLayout.LEFT));   //alinear a la izq

        add(new JButton("Amarillo"));
        add(new JButton("Azul"));
    }
}

//-----LAMINA PARA BOTONES CON BORDERLAYOUT-----//
class PanelLayout2 extends JPanel{
    public PanelLayout2(){

        /*con BorderLayout para Norte, Sur, Este, Oeste y Centro*/
        setLayout(new BorderLayout());

        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);
    }
}