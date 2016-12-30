package claseEnum;

/**
 * Creado por Ronald Arias - fecha: 22-dic-16.
 */
public class UsoTallas {

    //la clase enum sirve para que no se puedan dar valores diferentes a la variable
    //por ejemplo no puede ser talla azul o talla invisible, solo las que se muestran
    enum Talla{pequeno, mediano, grande, extraGrande};

    public static void main (String[] args){

        //se crean los objetos de tipo Talla
        Talla s = Talla.pequeno;
        Talla m = Talla.mediano;
        Talla l = Talla.grande;
        Talla xl = Talla.extraGrande;
        //de esta forma no pueden haber mas variables q no sean las definidas al comienzo



    }
}
