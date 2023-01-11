/*4. Faca um programa que faca a multiplicacao de duas matrizes. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        int[][] multiplicacao = new int[4][4];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = rd.nextInt();
                mat2[i][j] = rd.nextInt();
                multiplicacao[i][j] = mat1[i][j] * mat2[i][j];
                System.out.println(multiplicacao[i][j]);
            }
        }
        sc.close();
    }
}