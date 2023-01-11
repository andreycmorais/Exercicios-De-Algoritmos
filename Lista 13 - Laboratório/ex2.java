/*2. Faca um algoritmo que construa uma matriz de nome MAT de 10 linhas e 15 colunas contendo numeros
inteiros. Em seguida escreva a soma dos elementos de cada linha e se a soma dos elementos e par ou
impar. Por fim escreva a soma dos elementos de cada coluna e se a soma dos elementos e par ou impar. */

import java.util.*;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int somaL, somaC, soma;
        int [][] MAT = new int [10][15];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                MAT [i][j] = rd.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            soma = 0;
            for (int j = 0; j < 15; j++) {
                soma += MAT[i][j];
            }
            somaL = soma;
        }
        for (int j = 0; j < 15; j++) {
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += MAT[i][j];
            }
            somaC = soma;
        }
    }
}