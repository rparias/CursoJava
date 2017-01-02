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

        //ACCIONES CON TECLAS//
        /*Paso 1: Crear mapa de entrada*/
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        /*Paso 2: Crear combinacion de teclas*/
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");

        /*Paso 3: Asignar combinacion de teclas a objeto*/
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
        mapaEntrada.put(teclaAzul, "fondo_azul");
        mapaEntrada.put(teclaRojo, "fondo_rojo");

        /*Paso 4: Asignar objeto a accion*/
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);
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