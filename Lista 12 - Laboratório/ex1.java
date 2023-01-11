/*1. Faca um programa que construa uma matriz 50 por 50 de numeros reais e apos construıda, colocar o
conteudo de sua diagonal principal dentro de um vetor, depois do vetor montado, imprimir o vetor*/

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double[][] mat = new double[50][50];
        double[] vet = new double[50];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = rd.nextDouble();
                if (i == j) {
                    vet[i] = mat[i][j];
                }
            }
        }
        for (int k = 0; k < vet.length; k++) {
            System.out.println(vet[k] * 100);
        }
        sc.close();
    }
}