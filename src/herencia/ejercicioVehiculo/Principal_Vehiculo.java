package herencia.ejercicioVehiculo;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Principal_Vehiculo {
    public static void main(String[] args){
        Coche miCoche1 = new Coche();
        miCoche1.setColor("rojo");

        Furgoneta miFurgoneta1 = new Furgoneta(580, 7);
        miFurgoneta1.setColor("azul");
        miFurgoneta1.setAsientosCuero("si");
        miFurgoneta1.setClimatizador("si");

        miCoche1.imprimirDatos();

        miFurgoneta1.imprimirDatos();
    }
}
