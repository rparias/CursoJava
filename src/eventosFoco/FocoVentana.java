package eventosFoco;

import javax.swing.*;
import java.awt.event.*;

/**
 * Creado por Ronald Arias - fecha: 30-dic-16.
 */
public class FocoVentana extends JFrame implements WindowFocusListener{

    public static void main(String[] args){
        FocoVentana miVentana = new FocoVentana();
        miVentana.iniciar();
    }

    FocoVentana marco1;
    FocoVentana marco2;

    //metodo para los marcos
    public void iniciar(){
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(400, 300, 600, 350);
        marco2.setBounds(1000, 300, 600, 350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //oyentes de la propia clase
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if(e.getSource() == marco1){
            marco1.setTitle("Tengo el foco");
        }else{
            marco2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if(e.getSource() == marco1){
            marco1.setTitle("Perdi el foco");
        }else{
            marco2.setTitle("Perdi el foco");
        }
    }
}
