/*7. Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima o vetor, o maior
elemento e a posicao que ele se encontra. */

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int maior = 0, pos = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
                pos = i;
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println("O maior número encontrado foi " + maior + " na posição " + pos);
        sc.close();
    }
}