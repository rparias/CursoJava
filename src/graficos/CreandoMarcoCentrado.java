package graficos;


import javax.swing.*;
import java.awt.*;

/**
 * Created by ron_1 on 17-dic-16.
 */
public class CreandoMarcoCentrado {
    public static void main (String[] args){
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame{
    //constructor
    public MarcoCentrado(){

        //--------DIMENSIONES PANTALLA---------//
        //devolver el tipo sistema nativo de ventana
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        //devuelve la resolucion de pantalla
        Dimension tamanoPantalla = miPantalla.getScreenSize();

        //asigno ancho y alto
        int anchoPantalla = tamanoPantalla.width;
        int altoPantalla = tamanoPantalla.height;

        setSize(anchoPantalla/2, altoPantalla/2);
        setLocation(anchoPantalla/4, altoPantalla/4);   //de esta forma esta centrada a 1/4 de pantalla


        //--------PARTE GRAFICA---------//
        setTitle("Marco Centrado");
        //cambiar icono
        Image miIcono = miPantalla.getImage("src/graficos/images/icono.png");
        setIconImage(miIcono);

    }
}
