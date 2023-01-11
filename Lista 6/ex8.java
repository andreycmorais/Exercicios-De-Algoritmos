/*8. Faca uma funcao recursiva que receba um numero inteiro positivo N e imprima todos os numeros naturais
de 0 ate N em ordem decrescente. */

import java.util.*;

public class ex8 {
    public static int naturaisDec(int n) {
        if (n == -1) {
            return 0;
        } else {
            System.out.println(n);
            return naturaisDec(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println(naturaisDec(n));
        sc.close();
    }
}