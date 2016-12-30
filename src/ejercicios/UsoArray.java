package ejercicios;

/**
 * Creado por Ronald Arias - fecha: 18-dic-16.
 */
public class UsoArray {
    public static void main(String[] args){
        //declarar matriz o array
        //forma 1
        int[] miMatriz = new int[5];

        miMatriz[0]=5;
        miMatriz[1]=38;
        miMatriz[2]=-15;
        miMatriz[3]=92;
        miMatriz[4]=71;

        //forma 2
        //int [] mi_matriz = {5, 38, -15, 92, 71};


        for(int i = 0; i<miMatriz.length; i++){
            System.out.println("Valor del indice: " + i + " = " + miMatriz[i]);
        }

    }
}
