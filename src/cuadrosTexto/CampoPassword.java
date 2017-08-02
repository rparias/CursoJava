package cuadrosTexto;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CampoPassword {
    public static void main(String[] args) {
        MarcoPassword miMarco = new MarcoPassword();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPassword extends JFrame{
    public MarcoPassword() {
        setTitle("Comprobar Password");
        setVisible(true);
        setBounds(600, 400, 300, 200);

        LaminaPassword miLamina = new LaminaPassword();
        add(miLamina);
    }
}

//--->Lamina Principal
class LaminaPassword extends JPanel{

    private JPasswordField txtPassword;

    public LaminaPassword() {
        setLayout(new BorderLayout());
        CompruebaPassword miEvento = new CompruebaPassword();

        //--->Sublamina
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2,2));

            JLabel lblNombre = new JLabel("Usuario:");
            JLabel lblPassword = new JLabel("Contraseña:");
            JTextField txtNombre = new JTextField(15);
            txtPassword = new JPasswordField(15);    //cuadro de contraseña

            txtPassword.getDocument().addDocumentListener(miEvento);    //pone a la escucha

            laminaSuperior.add(lblNombre);
            laminaSuperior.add(txtNombre);
            laminaSuperior.add(lblPassword);
            laminaSuperior.add(txtPassword);

        JButton btnValidar = new JButton("Validar");

        //agrego la sublamina y el boton
        add(laminaSuperior, BorderLayout.NORTH);
        add(btnValidar, BorderLayout.SOUTH);
    }

    private class CompruebaPassword implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] contrasena;
            contrasena=txtPassword.getPassword();

            if(contrasena.length < 8 || contrasena.length > 12)
                txtPassword.setBackground(Color.RED);
            else
                txtPassword.setBackground(Color.WHITE);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char[] contrasena;
            contrasena=txtPassword.getPassword();

            if(contrasena.length < 8 || contrasena.length > 12)
                txtPassword.setBackground(Color.RED);
            else
                txtPassword.setBackground(Color.WHITE);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}