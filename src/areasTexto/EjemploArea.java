package areasTexto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploArea {
    public static void main(String[] args) {
        MarcoArea miMarco = new MarcoArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoArea extends JFrame{
    public MarcoArea() {
        setTitle("Ejemplo de Area de texto");
        setBounds(500, 300, 500, 350);
        setVisible(true);

        LaminaArea miLamina = new LaminaArea();
        add(miLamina);
    }
}

class LaminaArea extends JPanel{

    private JTextArea areaTexto;

    public LaminaArea() {
        areaTexto = new JTextArea(10, 20);
        areaTexto.setLineWrap(true); //evita ensanchar el area y dar salto de linea

        //--->Barras de desplazamiento o scroll
        JScrollPane laminaConBarras = new JScrollPane(areaTexto);

        //boton
        JButton miBoton = new JButton("Aceptar");
        miBoton.addActionListener(new GestionaArea());  //oyente

        add(laminaConBarras);
        add(miBoton);
    }

    private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(areaTexto.getText());
        }
    }
}
