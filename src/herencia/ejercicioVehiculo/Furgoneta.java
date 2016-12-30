package herencia.ejercicioVehiculo;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Furgoneta extends Coche{

    private int capacidadCarga;
    private int plazasExtra;

    //CONSTRUCTOR
    public Furgoneta(int capacidadCarga, int plazasExtra){
        super();  //llama al constructor de la clase padre
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getPlazasExtra() {
        return plazasExtra;
    }

    public void setPlazasExtra(int plazasExtra) {
        this.plazasExtra = plazasExtra;
    }

    //imprimir datos
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.print(" - Capacidad de carga: " + getCapacidadCarga() + " - Plazas: " + getPlazasExtra());
    }

}
