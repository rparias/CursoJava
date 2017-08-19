package programacion_generica.clases_propias;


import java.util.GregorianCalendar;

public class MetodosGenericos {
    public static void main(String[] args) {

        String nombres[] = {"Jose", "Maria", "Pedro"};
        String elementos = MisMatrices.getMenor(nombres);
        System.out.println(elementos);

        GregorianCalendar fechas[] = {new GregorianCalendar(2017, 8, 19),
                new GregorianCalendar(2017, 8, 18),
                new GregorianCalendar(2017, 8, 17)};
        System.out.println(MisMatrices.getMenor(fechas));
    }
}

class MisMatrices{
    //metodo generico que devuelve un generico y devuelve el menor al usar compareTo
    public static <T extends Comparable> T getMenor(T[] array){
        if(array==null || array.length==0)
            return null;

        T elementoMenor = array[0];
        for(int i = 1; i<array.length; i++){
            if (elementoMenor.compareTo(array[i]) > 0)
                elementoMenor = array[i];
        }
        return elementoMenor;
    }
}