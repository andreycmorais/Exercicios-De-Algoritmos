/*1. Faca um programa que leia um numero inteiro e o imprima. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número inteiro");
        n = sc.nextInt();
        System.out.println("O número digitado é: " + n);
        sc.close();
    }
}
