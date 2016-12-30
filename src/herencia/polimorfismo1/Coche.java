package herencia.polimorfismo1;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    //CONSTRUCTOR
    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    //GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
