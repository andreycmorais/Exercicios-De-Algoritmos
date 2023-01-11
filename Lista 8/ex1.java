/*1. Leia um vetor com 20 numeros inteiros. Escreva os elementos do vetor eliminando elementos repetidos */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero");
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] != vet[j]) {
                    System.out.println(vet[j]);
                }
            }
        }
        sc.close();
    }
}
