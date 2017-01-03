package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creado por Ronald Arias - fecha: 02-ene-17.
 */
public class VariosOyentes {
    public static void main(String[] args){
        MarcoPrincipal miMarco = new MarcoPrincipal();
    }
}

class MarcoPrincipal extends JFrame{
    public MarcoPrincipal(){
        setVisible(true);
        setTitle("Varios Oyentes");
        setBounds(600, 300, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //agregar lamina
        LaminaPrincipal miLamina = new LaminaPrincipal();
        add(miLamina);
    }
}

class LaminaPrincipal extends JPanel{

    JButton btnCerrar;  //este lo voy a usar en mas metodos, por eso esta afuera

    public LaminaPrincipal(){
        JButton btnNuevo = new JButton("Nuevo");
        btnCerrar = new JButton("Cerrar todo");

        //agregar botones
        add(btnNuevo);
        add(btnCerrar);

        //instanciar oyente
        OyenteNuevo miOyente = new OyenteNuevo();
        btnNuevo.addActionListener(miOyente);
    }

    //-----CLASE OYENTE INTERNA-----//
    private class OyenteNuevo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente marcoE = new MarcoEmergente(btnCerrar);  //el boton de cerrar viaja a la clase interna CierraTodos
        }
    }
}

//-----CLASE PARA NUEVAS VENTANAS-----//
class MarcoEmergente extends JFrame{

    private static int contador = 0;

    public MarcoEmergente(JButton boton_de_principal){
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 300, 150);
        setVisible(true);

        //instanciar oyente
        CierraTodos oyenteCerrar = new CierraTodos();
        boton_de_principal.addActionListener(oyenteCerrar);
    }

    //-----CLASE OYENTE INTERNA-----//
    private class CierraTodos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();  //con esto se cierran las ventanas
        }
    }
}