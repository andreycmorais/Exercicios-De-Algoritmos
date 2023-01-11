/*2. Escreva uma funcao recursiva ImprimeSerie(i,j,k). Esta funcao imprime na tela a serie de valores do
intervalo [i,j], com incremento k. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k = 1;
        System.out.println("Digite dois números");
        i = sc.nextInt();
        j = sc.nextInt();
        imprimeSerie(i, j, k);
        sc.close();
    }

    public static int imprimeSerie(int i, int j, int k) {
        if (i == j) {
            return i;
        } else {
            System.out.println(i);
            return imprimeSerie(i + k, j, k);
        }

    }
}