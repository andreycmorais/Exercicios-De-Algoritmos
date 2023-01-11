/*17. Faca um programa que leia um numero inteiro positivo n e calcule a soma dos n primeiros numeros
naturais. */

import java.util.*;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, soma = 0;
        n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
