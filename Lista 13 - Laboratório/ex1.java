/*1. Faca um programa que le 10 numeros inteiros do teclado e armazene em um vetor. Ao final imprima o
vetor armazenado nos dois sentidos. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        for (int i = vet.length; i >= 0; i--) {
            System.out.println(vet[i]);
        }
        sc.close();
    }
}