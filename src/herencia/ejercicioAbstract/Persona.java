package herencia.ejercicioAbstract;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public abstract class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //METODO ABSTRACTO PARA LAS SUBCLASES
    public abstract String dameDescripcion();   //la clase debe ser abstracta
}
