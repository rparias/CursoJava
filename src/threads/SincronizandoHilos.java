package threads;

public class SincronizandoHilos {
    public static void main(String[] args) {
        HilosVarios hilo1 = new HilosVarios();
        HilosVarios hilo2 = new HilosVarios();

        hilo1.start();

        //hasta que no muera este hilo, no empieza el siguiente
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //ahora que han muerto los dos hilos, muestra el siguiente mensaje
        System.out.println("Terminadas las tareas");
    }
}


//-----------CLASE HILOS VARIOS-----------//
class HilosVarios extends Thread{

    public void run(){
        for(int i=0; i<15;i++){
            System.out.println("Ejecutando hilo " + getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}