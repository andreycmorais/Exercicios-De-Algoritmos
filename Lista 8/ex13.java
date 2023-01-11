/*13. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posicao das matrizes
lidas. */

import java.util.*;

public class ex13 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        int[][] maior = new int[4][4];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat1[i][j] = rd.nextInt(100);
                mat2[i][j] = rd.nextInt(100);
                if (mat1[i][j] > mat2[i][j]) {
                    maior[i][j] = mat1[i][j];
                } else if (mat2[i][j] > mat1[i][j]) {
                    maior[i][j] = mat2[i][j];
                }
                System.out.print(maior[i][j] + "/");
            }
        }
    }
}
