package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {
    public static void main(String[] args) {
        Banco b = new Banco();
        for(int i=0; i<100; i++){
            EjecucionTransferencias ejecucionTransferencias = new EjecucionTransferencias(b, i, 2000);
            Thread t = new Thread(ejecucionTransferencias);
            t.start();
        }
    }
}


//-------------------CLASE BANCO-------------------//
class Banco{
    private final double[] cuentas;

    //instancia de ReentrantLock para bloquear y desbloquear
    //private Lock cierraBanco = new ReentrantLock();

    //creo una condicion
    //private Condition saldoSuficiente;

    //creo 100 cuentas con 2000 dolares cada una
    public Banco() {
        cuentas = new double[100];
        for(int i=0; i<cuentas.length; i++){
            cuentas[i] = 2000;
        }

        //cada vez q se crea un banco se crea un bloqueo establecido con una condicion
        //saldoSuficiente = cierraBanco.newCondition();
    }

    //este es el metodo que hace que funcionen las transferencias automaticas
    public synchronized void transferencia(int ctaOrigen, int ctaDestino, double cantidad) throws InterruptedException {

        //TODO comento esto prque al usar synchronized ya no es necesario y lo reescribo abajo
        //TODO esto se puede hacer solo porque tengo una sola condicion
        /*
        //bloqueo el siguiente segmento de codigo solo para un hilo y lo pongo en un try
        cierraBanco.lock();


        try{
            while(cuentas[ctaOrigen] < cantidad) {  //evalua si el saldo no es mayor a la transferencia

                //mientras sea verdad (saldo insuficiente) el hilo permanezca a la espera
                saldoSuficiente.await();
            }

            System.out.println("Hilo actual: " + Thread.currentThread());
            cuentas[ctaOrigen] -= cantidad; //dinero q sale de la ctaOrigen
            System.out.printf("%10.2f de %d para %d", cantidad, ctaOrigen, ctaDestino);
            cuentas[ctaDestino] += cantidad;    //dinero que ingresa a la ctaDestino
            System.out.printf("\nSaldo total: %10.2f%n", getSaldoTotal());

            saldoSuficiente.signalAll();    //despierto a los hilos a la espera de la condicion

        }finally {
            cierraBanco.unlock();   //desbloqueo el segmento de codigo anterior para el siguiente hilo
        }*/

        while(cuentas[ctaOrigen] < cantidad) {  //evalua si el saldo no es mayor a la transferencia

            //mientras sea verdad (saldo insuficiente) el hilo permanezca a la espera
            wait();
        }
        System.out.println("Hilo actual: " + Thread.currentThread());
        cuentas[ctaOrigen] -= cantidad; //dinero q sale de la ctaOrigen
        System.out.printf("%10.2f de %d para %d", cantidad, ctaOrigen, ctaDestino);
        cuentas[ctaDestino] += cantidad;    //dinero que ingresa a la ctaDestino
        System.out.printf("\nSaldo total: %10.2f%n", getSaldoTotal());

        notifyAll();    //despierto a los hilos a la espera de la condicion
    }

    public double getSaldoTotal(){
        double sumaCuentas = 0;
        for(double a: cuentas){
            sumaCuentas += a;
        }
        return sumaCuentas;
    }
}

//-------------------CLASE EJECUCION TRANSFERENCIAS-------------------//
class EjecucionTransferencias implements Runnable{

    private Banco banco;
    private int origen;
    private double max;

    public EjecucionTransferencias(Banco banco, int origen, double max) {
        this.banco = banco;
        this.origen = origen;
        this.max = max;
    }

    @Override
    public void run() {
        try {
            while(true){
                int paraLaCuenta=(int)(100*Math.random());
                double cantidad = max*Math.random();
                banco.transferencia(origen, paraLaCuenta, cantidad);    //aqui llamo al metodo q hace las transferencias
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}