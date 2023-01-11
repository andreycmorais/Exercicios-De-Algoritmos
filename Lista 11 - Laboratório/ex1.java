/*1. Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme a matriz
gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os elementos acima da diagonal
principal. Imprima a matriz original e a matriz transformada. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] matriz = new int[4][4];
        int[][] menor = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(20);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    menor[i][j] = 0;
                } else {
                    menor[i][j] = matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("/");
            }
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(menor[i][j]);
                System.out.print("/");
            }
        }
    }
}