package proyecto;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por Ronald Arias - fecha: 24-dic-16.
 */
public class PrincipalProyecto {
    public static void main (String[] args){

        Marco miMarco = new Marco();

    }
}

//------CLASE MARCO-----
class Marco extends JFrame{
    public Marco(){
        setVisible(true);
        setSize(600, 400);
        setLocation(600, 300);
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //agregar lamina
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

//-----CLASE LAMINA-----
class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font fuenteArial = new Font("Arial", Font.BOLD, 24);

        g2.setFont(fuenteArial);
        g2.drawString("FUNDACIÓN SEMBRAR", 160, 35);
        g2.drawLine(0, 50, 600, 50);
    }
}
