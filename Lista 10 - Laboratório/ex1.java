/*1. Faca um programa que leia 5 valores inteiros, armazeno-os em um vetor, calcule e apresente a soma
destes valores.*/

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, i;
        int[] vet = new int[5];
        for (i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        System.out.println(soma);
        sc.close();
    }
}