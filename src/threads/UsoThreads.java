package threads;

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {
    public static void main(String[] args) {
        JFrame miMarco = new MarcoRebote();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

//CREACION DE LOS HILOS DE EJECUCION
//---Paso 1: crear clase que implemente la interfaz Runnable - metodo run()
class PelotaHilos implements Runnable{

    private Pelota pelota;
    private Component componente;

    public PelotaHilos(Pelota pelota, Component componente) {
        this.pelota = pelota;
        this.componente = componente;
    }

    @Override
    public void run() {
        //---Paso 2: escribir el codigo de la tarea dentro de este metodo

        //-forma1:
        /*while(!Thread.interrupted()){
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
        }*/

        System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());

        //-forma2:
        while(!Thread.currentThread().isInterrupted()){
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());

            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                //System.out.println("Hilo bloqueado, no se puede interrumpir");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Estado del hilo al finalizar: " + Thread.currentThread().isInterrupted());
    }
}



//Movimiento de la pelota------------------------------------------

class Pelota{

    private static final int TAMX=15;
    private static final int TAMY=15;
    private double x=0;
    private double y=0;
    private double dx=1;
    private double dy=1;

    // Mueve la pelota invirtiendo posición si choca con límites
    public void mueve_pelota(Rectangle2D limites){

        x+=dx;
        y+=dy;

        if(x<limites.getMinX()){
            x=limites.getMinX();
            dx=-dx;
        }

        if(x + TAMX>=limites.getMaxX()){
            x=limites.getMaxX() - TAMX;
            dx=-dx;
        }

        if(y<limites.getMinY()){
            y=limites.getMinY();
            dy=-dy;
        }

        if(y + TAMY>=limites.getMaxY()){
            y=limites.getMaxY()-TAMY;
            dy=-dy;
        }

    }

    //Forma de la pelota en su posición inicial
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,TAMX,TAMY);
    }
}

//Lámina que dibuja las pelotas------------------------------------------

class LaminaPelota extends JPanel{

    private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();

    //Añadimos pelota a la lámina
    public void add(Pelota b){
        pelotas.add(b);
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;

        for(Pelota b: pelotas){
            g2.fill(b.getShape());
        }
    }
}


//Marco con lámina y botones------------------------------------------

class MarcoRebote extends JFrame{

    private LaminaPelota lamina;
    private Thread t1, t2, t3;
    private JButton arranca1, arranca2, arranca3;
    private JButton detener1, detener2, detener3;

    public MarcoRebote(){
        setBounds(600,300,600,350);
        setTitle ("Rebotes");
        lamina=new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones=new JPanel();

        //agrego los botones independientemente

        arranca1 = new JButton("Hilo 1");
        arranca1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego(evento);
            }
        });

        arranca2 = new JButton("Hilo 2");
        arranca2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego(evento);
            }
        });

        arranca3 = new JButton("Hilo 3");
        arranca3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego(evento);
            }
        });

        detener1 = new JButton("Deten 1");
        detener1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                detener(evento);
            }
        });

        detener2 = new JButton("Deten 2");
        detener2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                detener(evento);
            }
        });

        detener3 = new JButton("Deten 3");
        detener3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                detener(evento);
            }
        });

        laminaBotones.add(arranca1);
        laminaBotones.add(arranca2);
        laminaBotones.add(arranca3);
        laminaBotones.add(detener1);
        laminaBotones.add(detener2);
        laminaBotones.add(detener3);
        add(laminaBotones, BorderLayout.SOUTH);
    }


    //Añade pelota y la mueve 3000 veces en cada posicion
    public void comienza_el_juego (ActionEvent e){

        Pelota pelota=new Pelota();
        lamina.add(pelota);

        //---Paso 3: instancia de la clase creada (PelotaHilos) y almacenarla en una variable Runnable
        Runnable r = new PelotaHilos(pelota, lamina);

        //---Paso 4: crear instancia de la clase Thread y pasar como parametro al constructor el objeto Runnable
        if(e.getSource().equals(arranca1)){
            t1 = new Thread(r);

            //---Paso 5: poner en marcha el hilo con start()
            t1.start();
        }else if(e.getSource().equals(arranca2)){
            t2 = new Thread(r);
            t2.start();
        }else{
            t3 = new Thread(r);
            t3.start();
        }


    }

    //-------------------------INTERRUPCION DE HILOS-------------------------//
    //Detiene el hilo del programa
    public void detener(ActionEvent e){

        if(e.getSource().equals(detener1)){
            t1.interrupt();
            //esto genera un try-catch InterruptedException en el run por el sleep
        }else if(e.getSource().equals(detener2)){
            t2.interrupt();
        }else{
            t3.interrupt();
        }
    }
}
