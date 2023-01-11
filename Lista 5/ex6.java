/*6. Faca uma funcao que receba dois numeros e retorne qual deles e o maior. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite 2 números diferentes");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("O maior valor é: " + maiorValor(n1, n2));
        sc.close();
    }

    public static int maiorValor(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
