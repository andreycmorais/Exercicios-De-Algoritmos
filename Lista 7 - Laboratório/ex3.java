/*3. Escreva um programa que leia um numero inteiro positivo n e em seguida imprima n linhas do chamado
Triangulo de Floyd. Para n = 6, temos:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
54. Faca um programa que receba um numero inteiro maior do que 1, e verifique se o numero fornecido
e primo ou nao. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coluna, i, j, k = 1;
        System.out.println("Colunas");
        coluna = sc.nextInt();
        System.out.println();
        for (i = 1; i <= coluna; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println("\n");
        }
    }
}
