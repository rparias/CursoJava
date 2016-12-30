package herencia.ejercicioEmpleado;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public interface InterfazJefes extends InterfazTrabajadores{    //La interfaz jefes hereda de la interfaz trabajadores

    //METODOS
    //solo se definen, no se desarrollan
    public abstract String tomarDecisiones(String decision);
}
