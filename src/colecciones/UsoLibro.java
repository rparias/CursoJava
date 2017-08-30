package colecciones;

public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Programacion en Java", "Juan", 25);
        Libro libro2 = new Libro("Programacion en Java", "Juan", 25);

        if(libro1.equals(libro2))
            System.out.println("Es el mismo libro");
        else
            System.out.println("No es el mismo libro");

        System.out.println("Hashcode libro1: " + libro1.hashCode());
        System.out.println("Hashcode libro2: " + libro2.hashCode());
    }
}
