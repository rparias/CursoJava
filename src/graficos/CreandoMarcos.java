package graficos;

import javax.swing.*;   //se importan todas las clases de este paquete
import java.awt.*;

/**
 * Created by ron_1 on 14-dic-16.
 */
public class CreandoMarcos {
    public static void main (String[] args){
        //aqui debo instanciar la clase miMarco
        miMarco marco1 = new miMarco();

    }
}



/**creacion de clases, puede ser en archivos separados*/

//como hereda de JFrame puedo usar todos sus metodos dentro de mi clase
class miMarco extends JFrame{

    //constructor
    public miMarco(){
        //por defecto la ventana viene invisible y con tamano de 0px y con
        // x=0 y=0 en el cuarto cuadrante de un plano cartesiano
        //setSize(500,300);
        //setLocation(600,300);

        /**setBounds puede usarse para reemplazar a setSize y setLocation*/
        setBounds(600,300,500,300);

        setVisible(true);
        setTitle("Mi ventana");

        //impedir que se cambie el tamano de pantalla
        setResizable(false);

        //abrir en pantalla completa, debe estar comentado setResizable
        //setExtendedState(Frame.MAXIMIZED_BOTH);

        //aqui le digo que debe cerrarse la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

