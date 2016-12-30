package herencia.ejercicioEmpleado;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public final class Jefe extends Empleado implements InterfazJefes{   //final nos dice q hasta aqui va la herencia, ya no puede heredar otra clase de esta, funciona tambien con metodos
    private double incentivo;

    //CONSTRUCTOR
    public Jefe(String nombre, double sueldo, int anio, int mes, int dia){
        super(nombre, sueldo, anio, mes, dia);
    }

    //GETTER Y SETTER
    public double getIncentivo() {
        return incentivo;
    }
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo(){
        double sueldoJefe = super.getSueldo();  //llama al getSueldo del padre
        return sueldoJefe + getIncentivo();
    }

    //METODO DE LA INTERFAZ TRABAJADORES
    public String tomarDecisiones(String decision){
        return "Un miembro de la direccion ha tomado la decision de " + decision;
    }

    //METODO DE LA INTERFAZ JEFES QUE HEREDA A INTERFAZ TRABAJADORES
    public double establecerBonus(double bonus){
        double prima = 2000;
        return InterfazTrabajadores.bonusBase + bonus + prima;
    }
}
