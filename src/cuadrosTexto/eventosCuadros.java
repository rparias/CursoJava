package cuadrosTexto;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class eventosCuadros {
    public static void main(String[] args) {
        MarcoPrueba miMarco = new MarcoPrueba();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPrueba extends JFrame{
    public MarcoPrueba() {
        setTitle("Eventos con cuadros de texto");
        setBounds(500, 300, 500, 350);
        setVisible(true);

        LaminaPrueba miLamnina = new LaminaPrueba();
        add(miLamnina);
    }
}

class LaminaPrueba extends JPanel{
    public LaminaPrueba() {
        JTextField txtCampo = new JTextField(20);
        EscuchaTexto evento = new EscuchaTexto();

        Document miDocumento = txtCampo.getDocument();
        miDocumento.addDocumentListener(evento);    //pone el documento a la escucha con instancia de EscuchaTexto
        add(txtCampo);
    }

    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}