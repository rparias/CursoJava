package cuadrosTexto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTexto {
    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setTitle("Cuadros de Texto");
        setBounds(600, 300, 600, 350);
        setVisible(true);

        LaminaTexto miLamina = new LaminaTexto();
        add(miLamina);
    }
}

class LaminaTexto extends JPanel{
    private JTextField txtCampo1;

    public LaminaTexto() {
        //label
        JLabel lblEtiqueta = new JLabel("Email:");
        add(lblEtiqueta);

        //cuadro de texto
        txtCampo1 = new JTextField(15);
        JButton boton1 = new JButton("Aceptar");
        add(txtCampo1);

        //boton
        DameTexto miEvento = new DameTexto();
        boton1.addActionListener(miEvento);
        add(boton1);
    }

    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(txtCampo1.getText().trim()); //trim quita espacios antes de la cadena
        }
    }
}
