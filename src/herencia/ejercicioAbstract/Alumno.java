package herencia.ejercicioAbstract;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public class Alumno extends Persona{

    private String carrera;

    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String dameDescripcion(){
        return "Este alumno esta estudiando la carrera de "+getCarrera();
    }
}
