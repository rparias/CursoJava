package programacion_generica.clases_propias;

public class UsoPareja {
    public static void main(String[] args) {

        Pareja<String> una = new Pareja<String>();
        una.setPrimero("Ronald");
        //cuando uso Pareja<String> ahora el setPrimero me pide un parametro String y no un T

        System.out.println(una.getPrimero());
        //igual ya no devuelve un T, devuelve un String por ser generico cuando instancie


        //ahora puedo aplicar la programacion generica para tipo Persona
        Persona pers = new Persona("Gabby");
        Pareja<Persona> otra = new Pareja<Persona>();
        otra.setPrimero(pers);
        System.out.println(otra.getPrimero());
    }
}

class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //con esto ya me devuelve el nombre y no .Persona@1540e19d
    public String toString(){
        return nombre;
    }
}
