package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Creado por Ronald Arias - fecha: 24-dic-16.
 */
public class Colores {
    public static void main (String[] args){

        MarcoColor miMarco = new MarcoColor();
    }
}


//-----CLASE MARCO CON COLOR-----
class MarcoColor extends JFrame{
    public MarcoColor(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 400, 400);
        setTitle("Prueba con colores");

        //lamina
        LaminaColor miLamina = new LaminaColor();
        add(miLamina);
        miLamina.setBackground(Color.DARK_GRAY);
        //miLamina.setBackground(SystemColor.window); //color del sistema
    }
}

class LaminaColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; //casteo

        //rectangulo
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        //g2.setPaint(Color.GREEN);
        g2.setPaint(new Color(159, 238,0));
        g2.fill(rectangulo);

        //elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(Color.BLACK);
        g2.draw(elipse);
        g2.setPaint(new Color(0, 153, 153));
        g2.fill(elipse);    //fill sirve para rellenar
    }
}