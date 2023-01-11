/*8. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui. */

import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] mat = new int[4][4];
        int cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = rd.nextInt(20);
                if (mat[i][j] > 10) {
                    cont++;
                }
            }
        }
        System.out.println("Existem " + cont + " números maiores que 10 na matriz.");
    }
}
