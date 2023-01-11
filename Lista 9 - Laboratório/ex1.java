/*1. Escreva uma funcao recursiva SomaSerie(i,j,k). Esta funcao devolve a soma da serie de valores do
intervalo [i,j], com incremento k. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k = 1;
        System.out.println("Digite dois valores:");
        i = sc.nextInt();
        j = sc.nextInt();
        System.out.println(somaIntervalo(i, j, k));
        sc.close();
    }

    public static int somaIntervalo(int i, int j, int k) {
        if (i == j) {
            return i;
        } else {
            return somaIntervalo(i + k, j, k) + i;
        }
    }
}