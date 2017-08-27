package threads;

public class SincronizandoHilos {
    public static void main(String[] args) {
        HilosVarios hilo1 = new HilosVarios();
        HilosVarios2 hilo2 = new HilosVarios2( hilo1);

        //no importa si esta primero hilo1 o hilo 2, ya que el hilo2 no empieza antes que acabe el hilo1
        hilo1.start();
        hilo2.start();

        //ahora los hilos estan en segundo plano y el hilo principal que corre el main esta liberado
        //por eso ahora se ve esta linea primero en la consola
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

//-----------CLASE HILOS VARIOS 2-----------//
class HilosVarios2 extends Thread{

    private Thread hilo;

    public HilosVarios2(Thread hilo){
        this.hilo = hilo;
    }

    //aqui le decimos que la tarea no comience hasta q termine el hilo que se le pasa como parametro al constructor
    public void run(){
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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