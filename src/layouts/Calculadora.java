package layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creado por Ronald Arias - fecha: 18/2/2017.
 */
public class Calculadora {
    public static void main(String[] args) {
        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora(){
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);

        //instancia de LaminaCalculadora
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
        //pack(); //se adapta la pantalla al tamaño favorito de los elementos
    }
}

class LaminaCalculadora extends JPanel{

    private JPanel laminaBotones;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;

    public LaminaCalculadora(){
        //disposicion de borderLayout
        setLayout(new BorderLayout());

        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        //------fin de la parte de pantalla

        //------inicio parte de botones
        //creo una nueva lamina para los botones, tambien podria crear una nueva clase
        laminaBotones = new JPanel();
        laminaBotones.setLayout(new GridLayout(4, 4));  //4 columnas 4 filas

        ActionListener insertar = new InsertaNumero();
        ActionListener operar = new AccionOrden();

        //botones
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", operar);

        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", operar);

        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", operar);

        ponerBoton("0", insertar);
        ponerBoton(".", insertar);
        ponerBoton("=", operar);
        ponerBoton("+", operar);

        add(laminaBotones, BorderLayout.CENTER);

        //------fin de parte de botones
        ultimaOperacion = "=";
        principio = true;
    }

    //metodo para agregar los botones y ponerlos a la escucha
    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        laminaBotones.add(boton);
    }

    private class InsertaNumero implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();  //getActionCommand devuelve el string asociado a esta accion

            if(principio){
                pantalla.setText("");
                principio = false;
            }

            pantalla.setText(pantalla.getText() + entrada);
        }
    }

    //clase privada para las operaciones
    private class AccionOrden implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();    //obtiene la operacion, por ejemplo "+, -, *, /, ="

            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;   //borra la pantalla despues de aplastar un boton de operacion
        }

        //este metodo se encarga de realizar todas las operaciones
        public void calcular(Double num){
            switch (ultimaOperacion){
                case "+":
                    resultado += num;
                    break;
                case "-":
                    resultado -= num;
                    break;
                case "*":
                    resultado *= num;
                    break;
                case "/":
                    resultado /= num;
                    break;
                case "=":
                    resultado = num;
                    break;
            }
            pantalla.setText("" + resultado);
        }
    }
}