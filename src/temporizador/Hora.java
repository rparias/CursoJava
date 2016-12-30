package temporizador;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Creado por Ronald Arias - fecha: 23-dic-16.
 */
public class Hora implements ActionListener{

    public void actionPerformed(ActionEvent e){     //esto se puede ver en la api de java
        Date ahora = new Date();
        System.out.println("La hora cada 5 segundos: "+ahora);

        //sonido del sistema con Toolkit
        Toolkit.getDefaultToolkit().beep();
    }
}
