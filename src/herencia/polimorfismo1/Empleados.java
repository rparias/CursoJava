package herencia.polimorfismo1;

/**
 * Creado por Ronald Arias - fecha: 20-dic-16.
 */
public class Empleados {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int antiguedad;
    private int telefono;
    private double salario;
    private Empleados supervisor;

    //CONSTRUCTOR
    public Empleados(String nombre, String apellido, int dni, String direccion, int telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Empleados getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Empleados supervisor) {
        this.supervisor = supervisor;
    }

    //IMPRIMIR
    public void imprimir(){
        System.out.println("Nombre: "+getNombre()+" "+getApellido()+" || "+"DNI: "+getDni()+" || "+"Direccion: "+getDireccion()
        +" || "+"Telefono: "+getTelefono()+" || "+"Salario: "+getSalario());
    }

    //CAMBIAR SUPERVISOR
    public void cambiarSupervisor(Empleados supervisor){
        setSupervisor(supervisor);
    }

    //INCREMENTAR SALARIO
    public void incrementarSalario(double incremento){
        setSalario(getSalario()+getSalario()*(incremento/100));
    }

}
