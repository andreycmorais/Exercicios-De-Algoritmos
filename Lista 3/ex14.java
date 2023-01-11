/*14. Faca um programa que leia um numero inteiro positivo par N e imprima todos os numeros pares de 0 ate
N em ordem decrescente. */

import java.util.*;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = n; i >= 0; i -= 2) {
            System.out.println(i);
        }
        sc.close();
    }
}