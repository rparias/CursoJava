package ejercicios;

/**
 * Creado por Ronald Arias - fecha: 18-dic-16.
 */
public class ArrayBidimensional {
    public static void main(String[] args){
        //declaracion de matriz bidimensional
        int matrizBidimensional[][] = new int[3][4];

        //rellenar matriz manualmente
        /*
        matrizBidimensional[0][0] = 15;
        matrizBidimensional[0][1] = 21;
        matrizBidimensional[0][2] = 18;
        matrizBidimensional[0][3] = 14;

        matrizBidimensional[1][0] = 31;
        matrizBidimensional[1][1] = 19;
        matrizBidimensional[1][2] = 55;
        matrizBidimensional[1][3] = 63;

        matrizBidimensional[2][0] = 36;
        matrizBidimensional[2][1] = 99;
        matrizBidimensional[2][2] = 59;
        matrizBidimensional[2][3] = 61;
        */

        //rellenar matriz automaticamente
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                matrizBidimensional[i][j] = (int)Math.round(Math.random()*99);
            }
        }

        //imprimir matriz
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(matrizBidimensional[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
