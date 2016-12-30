package herencia.polimorfismo1;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Secretario extends Empleados {
    private int despacho;
    private int fax;
    private double incremento;

    public Secretario(String nombre, String apellido, int dni, String direccion, int telefono, double salario, int despacho, int fax, double incremento) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
        this.incremento = 5;
    }

    //GETTERS Y SETTERS
    public int getDespacho() {
        return despacho;
    }
    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }
    public int getFax() {
        return fax;
    }
    public void setFax(int fax) {
        this.fax = fax;
    }
    public double getIncremento() {
        return incremento;
    }
    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    //IMPRIMIR
    public void imprimir(){
        super.imprimir();
        System.out.println(" || Despacho: "+getDespacho()+" || Fax: "+getFax()+" || Incremento: "+getIncremento()+" || Puesto: Secretario");
    }
}
