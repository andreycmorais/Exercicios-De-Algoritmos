/*3. Faca um programa que faca a soma de duas matrizes.*/

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        int[][] soma = new int[4][4];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = rd.nextInt();
                mat2[i][j] = rd.nextInt();
                soma[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println(soma[i][j]);
            }
        }
        sc.close();
    }
}