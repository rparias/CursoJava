package herencia.ejercicioEmpleado;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public interface InterfazTrabajadores {

    //en las interfaces no es necesario poner public static final en las constantes
    double bonusBase = 1500;

    //en las interfaces no es necesario poner public abstract en los metodos
    double establecerBonus(double bonus);

}
