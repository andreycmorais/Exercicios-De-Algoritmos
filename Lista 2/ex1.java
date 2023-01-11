/*1. Faca um programa que receba dois numeros e mostre qual deles é o maior. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite 2 números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n1 < n2) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Números iguais");
        }
        sc.close();
    }
}