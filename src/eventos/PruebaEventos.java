package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 * Creado por Ronald Arias - fecha: 28-dic-16.
 */
public class PruebaEventos {
    public static void main(String[] args){
        MarcoBotones miMarco = new MarcoBotones();
    }
}

//-----CLASE MARCO BOTONES-----//
class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("Eventos con botones");
        setBounds(700, 300, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //lamina
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}


//-----CLASE LAMINA BOTONES-----//
/*La clase LaminaBotones es el objeto listener*/
class LaminaBotones extends JPanel{
    JButton botonAzul = new JButton("Azul");    /*El boton es el objeto fuente*/
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo amarillo = new ColorFondo(Color.yellow);
        ColorFondo rojo = new ColorFondo(Color.red);

        botonAzul.addActionListener(azul);  /*Al hacer clic es el objeto evento, envia como parametro el objeto instanciado*/
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);
    }

    //-----clase interna ColorFondo-----//
    /*Ahora esta clase implementa de ActionListener*/
    private class ColorFondo implements ActionListener{
        private Color colorDeFondo;

        public ColorFondo(Color colorDeFondo){
            this.colorDeFondo = colorDeFondo;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFondo);
        }
    }

}