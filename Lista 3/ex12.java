/*12. Faca um programa que leia um numero inteiro positivo N e imprima todos os numeros naturais de 0 ate
N em ordem decrescente. */

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = n; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}