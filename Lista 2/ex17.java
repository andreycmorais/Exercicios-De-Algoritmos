/*17. Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles, assim como a
diferenca a existente entre ambos. */

import java.util.*;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, dif;
        System.out.println("Digite 2 números inteiros");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 > n2) {
            dif = n1 - n2;
            System.out.println("O maior número é " + n1 + ", e a diferença entre eles é de " + dif);
        } else if (n1 < n2) {
            dif = n2 - n1;
            System.out.println("O maior número é " + n2 + ", e a diferença entre eles é de " + dif);
        } else {
            System.out.println("Números iguais");
        }
        sc.close();
    }
}