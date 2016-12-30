package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Creado por Ronald Arias - fecha: 24-dic-16.
 */
public class PruebaDibujo {
    public static void main (String[] args){

        MarcoDibujos miMarco = new MarcoDibujos();

    }
}

//-----------------CLASE MARCO CON DIBUJOS-----------

class MarcoDibujos extends JFrame{

    public MarcoDibujos(){
        setTitle("Prueba de Dibujo");
        setSize(400, 400);
        setLocation(500, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //agregar la lamina con figuras
        LaminaFiguras miLamina = new LaminaFiguras();
        add(miLamina);
    }
}

//-----------------CLASE LAMINA CON FIGURAS-----------
class LaminaFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        /*figuras
        g.drawRect(50, 50, 200, 200);   //cuadrado
        g.drawLine(100, 100, 200, 300);    //linea recta
        g.drawArc(300, 200, 100, 400, 75, 80);  //arco
        */

        Graphics2D g2 = (Graphics2D) g; //casteo de g a graphics2d

        //rectangulo
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200.25, 150);
        g2.draw(rectangulo);

        //elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);    //esta linea es para que la elipse sea del porte del rectangulo
        g2.draw(elipse);

        //linea
        g2.draw(new Line2D.Double(100, 100, 300.25, 250));

        //circulo
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2.draw(circulo);
    }
}