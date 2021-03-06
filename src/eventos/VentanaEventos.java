package eventos;

import javax.swing.*;
import java.awt.event.*;

/**
 * Creado por Ronald Arias - fecha: 28-dic-16.
 */
public class VentanaEventos {
    public static void main (String[] args){
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //el programa termina totalmente
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(400, 300, 500, 300);

        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //solo se cierra esta ventana
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(900, 300, 500, 300);
    }
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){
        setVisible(true);
        //setTitle("Ventanas y Eventos");
        //setBounds(700, 300, 500, 300);

        //instancia de la clase oyente
        /*M_Ventana oyenteVentana = new M_Ventana();
        addWindowListener(oyenteVentana); */  /*se pone la ventana a la escucha*/

        addWindowListener(new M_Ventana());
    }
}


//-----CLASE OYENTE-----//
/*en vez de usar la interfaz WindowListener usamos la clase adaptadora WindowAdapter*/
class M_Ventana extends WindowAdapter{
    //se implementan por la interfaz
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }
}
