package eventosFoco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Creado por Ronald Arias - fecha: 30/12/2016.
 */
public class FocoEvento {
    public static void main(String[] args){
        MarcoFoco miMarco = new MarcoFoco();
    }
}

class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setVisible(true);
        setTitle("Eventos con foco");
        setBounds(600, 300, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //instancia de la lamina
        add(new LaminaFoco());
    }
}

//-----CLASE LAMINA-----//
class LaminaFoco extends JPanel{

    //cuadros de texto
    JTextField cuadro1;
    JTextField cuadro2;

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //invalidar layout (colocacion por defecto)
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);

        //elementos a la escucho
        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
    }

    //-----CLASE INTERNA OYENTE-----//
    private class LanzaFocos implements FocusListener{
        public void focusGained(FocusEvent e) {

        }

        public void focusLost(FocusEvent e) {
            System.out.println("He perdido el foco");
        }
    }
}
