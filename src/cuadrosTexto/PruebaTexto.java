package cuadrosTexto;

import javax.swing.*;
import java.awt.*;
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
    private JLabel lblResultado;

    //--->Lamina Principal con borderLayout
    public LaminaTexto() {
        //disposicion de elementos
        setLayout(new BorderLayout());

        //--->Sublamina con elementos en fila
        JPanel subLamina = new JPanel();
        subLamina.setLayout(new FlowLayout());

            //label campo
            JLabel lblEtiqueta = new JLabel("Email:");
            subLamina.add(lblEtiqueta);

            //cuadro de texto
            txtCampo1 = new JTextField(15);
            JButton boton1 = new JButton("Aceptar");
            subLamina.add(txtCampo1);

            //label resultado
            lblResultado = new JLabel("", JLabel.CENTER);
            subLamina.add(lblResultado);

            //boton
            DameTexto miEvento = new DameTexto();
            boton1.addActionListener(miEvento);
            subLamina.add(boton1);

        //agrego la lamina y la sublamina
        add(subLamina, BorderLayout.NORTH);
        add(lblResultado, BorderLayout.CENTER);
    }

    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;
            String email = txtCampo1.getText().trim();

            for(int i=0; i<email.length(); i++){
                if(email.charAt(i)=='@')
                    correcto++;
            }

            if(correcto!=1)
                lblResultado.setText("Este email no es valido");
            else
                lblResultado.setText("Email Correcto!");

            System.out.println(txtCampo1.getText().trim()); //trim quita espacios antes de la cadena
        }
    }
}
