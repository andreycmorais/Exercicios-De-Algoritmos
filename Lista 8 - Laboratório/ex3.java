/*3. Faca um algoritmo que receba um numero inteiro positivo n e calcule o seu fatorial, n!.*/

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fatorial;
        n = sc.nextInt();
        fatorial = calculaFatorial(n);
        System.out.println(fatorial);
        sc.close();
    }

    public static int calculaFatorial(int n) {
        int i, produto = 1;
        for (i = 1; i <= n; i++) {
            produto *= i;
        }
        return produto;
    }
}