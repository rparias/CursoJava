package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Creado por Ronald Arias - fecha: 30-dic-16.
 */
public class MultiplesAcciones {
    public static void main(String[] args){
        MarcoAcciones miMarco = new MarcoAcciones();
    }
}

//-----CLASE MARCO-----//
class MarcoAcciones extends JFrame{
    public MarcoAcciones(){
        setVisible(true);
        setBounds(600, 300, 600, 400);
        setTitle("Multiples acciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //lamina
        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}

//-----CLASE LAMINA-----//
class PanelAccion extends JPanel{
    //botones
    public PanelAccion(){

        //instanciar clase oyente
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/eventos/icon/yellow.png"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/eventos/icon/blue.png"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/eventos/icon/red.png"), Color.RED);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
    }


    //-----CLASE INTERNA OYENTE PARA CAMBIAR DE COLOR DE FONDO-----//
    private class AccionColor extends AbstractAction{

        public AccionColor(String nombre, Icon icono, Color colorBoton){
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
            putValue("color_de_fondo", colorBoton);
        }

        //acciones de los botones al ser pulsados
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color_de_fondo");
            setBackground(c);   //por setBackground la clase se hace interna
            System.out.println("Nombre: " + getValue(Action.NAME) + " --- Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}