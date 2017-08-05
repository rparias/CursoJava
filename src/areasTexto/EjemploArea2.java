package areasTexto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploArea2 {
    public static void main(String[] args) {
        MarcoArea2 miMarco = new MarcoArea2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoArea2 extends JFrame{
    public MarcoArea2() {
        setTitle("Ejemplo de area de texto 2");
        setBounds(500,300,500,350);

        miLamina2 lamina = new miLamina2();
        add(lamina);
    }
}

class miLamina2 extends JPanel{

    private JTextArea area;
    private JButton btnInsertar;
    private JButton btnSaltoLinea;
    private JScrollPane laminaBarras;

    public miLamina2() {
        setLayout(new BorderLayout());
        area = new JTextArea(8,20);
        laminaBarras = new JScrollPane(area);
        add(laminaBarras, BorderLayout.CENTER);

        //--->Sublamina
        JPanel sublamina2 = new JPanel();
        sublamina2.setLayout(new FlowLayout());
        btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(new oyenteInsertar());
        btnSaltoLinea = new JButton("Poner Salto");
        btnSaltoLinea.addActionListener(new oyenteSalto());
        sublamina2.add(btnInsertar);
        sublamina2.add(btnSaltoLinea);

        add(sublamina2, BorderLayout.SOUTH);
    }

    private class oyenteInsertar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            area.append("En un lugar de la mancha de cuyo nombre no quiero acordarme");
        }
    }

    private class oyenteSalto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean salta = !area.getLineWrap();    //si no hay salto de linea se pone true
            area.setLineWrap(salta);

            /*if(salta)
                btnSaltoLinea.setText("Quitar Salto");
            else
                btnSaltoLinea.setText("Poner Salto");*/

            //otra forma de if
            btnSaltoLinea.setText(salta ? "Quitar Salto" : "Poner Salto");
        }
    }
}