package graficos;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por Ronald Arias - fecha: 24-dic-16.
 */
public class Fuentes {
    public static void main(String[] args){

        Marco miMarco = new Marco();
    }
}

class Marco extends JFrame{
    public Marco(){
        setTitle("Prueba con fuentes");
        setVisible(true);
        setBounds(400, 200, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //lamina
        LaminaFuentes miLamina = new LaminaFuentes();
        add(miLamina);
    }
}

class LaminaFuentes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font fuenteAdobe = new Font("Adobe Caslon Pro", Font.BOLD, 28);
        Font fuenteArial = new Font("Arial", Font.ITALIC, 24);

        g2.setFont(fuenteAdobe);
        g2.setColor(Color.BLUE);
        g2.drawString("Ronald", 100, 100);

        g2.setFont(fuenteArial);
        g2.setColor(new Color(82, 128, 41));
        g2.drawString("Curso de Java", 100, 200);
    }
}
