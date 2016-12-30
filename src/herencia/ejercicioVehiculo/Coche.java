package herencia.ejercicioVehiculo;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Coche {
    private int ruedas;
    private int ancho;
    private int largo;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    //CONSTRUCTOR
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    //GETTER Y SETTER

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPesoPlataforma() {
        return pesoPlataforma;
    }

    public void setPesoPlataforma(int pesoPlataforma) {
        this.pesoPlataforma = pesoPlataforma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getAsientosCuero() {
        if(asientosCuero == true){
            return "Si";
        }else{
            return "No";
        }
    }

    public void setAsientosCuero(String asientosCuero) {
        if(asientosCuero == "si"){
            this.asientosCuero = true;
        }else{
            this.asientosCuero = false;
        }

    }

    public String getClimatizador() {
        if(climatizador == true){
            return "Si";
        }else{
            return "No";
        }
    }

    public void setClimatizador(String climatizador) {
        if(climatizador == "si"){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    public void imprimirDatos(){
        System.out.print("\nRuedas: " + getRuedas() + " - Ancho: " + getAncho() + " - Largo: " + getLargo() + " - Motor: " + getMotor() +
                " - Peso Plataforma: " + getPesoPlataforma() + " - Color: " + getColor() + " - Peso total: " + getPesoTotal() +
                " - Asientos de cuero: " + getAsientosCuero() + " - Climatizador: " + getClimatizador());
    }
}
