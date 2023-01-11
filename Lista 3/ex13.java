/*13. Faca um programa que leia um numero inteiro positivo par N e imprima todos os numeros pares de 0 ate
N em ordem crescente. */

import java.util.*;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}