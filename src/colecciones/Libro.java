package colecciones;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getDatos(){
        return "Titulo: " + titulo + " | Autor: " + autor + " | ISBN: " + ISBN;
    }

    //sobreescribo el metodo equals para que diferencie los libros por ISBN
    /*public boolean equals(Object obj){
        if(obj instanceof Libro){   //si obj es una instancia de libro
            Libro otro = (Libro)obj;
            if(this.ISBN == otro.ISBN)
                return true;
            else
                return false;
        }
        return false;
    }*/

    //sobreescribo el metodo equals y hashcode para que diferencie los libros por ISBN
    //estos los genera automaticamente el programa si se lo indica, es similar a lo de arriba
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        return ISBN == libro.ISBN;
    }

    @Override
    public int hashCode() {
        return ISBN;
    }
}
