package ejercicios;

/**
 * Creado por Ronald Arias - fecha: 18-dic-16.
 */
public class UsoForEach2 {
    public static void main(String[] args){
        //declarar matriz para numeros
        int [] matrizNumerosAleatorios = new int[25];

        //rellenar con numeros aleatorios
        for(int i = 0; i<matrizNumerosAleatorios.length; i++){
            //numeros aleatorios hasta 30
            matrizNumerosAleatorios[i] = (int)Math.round(Math.random()*30);
        }

        //for each
        for(int numeros:matrizNumerosAleatorios){
            System.out.print(numeros+" ");
        }
    }
}
