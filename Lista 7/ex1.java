/*1. Faca um programa que possua um vetor denominado A que armazene 6 numeros inteiros. O programa
deve executar os seguintes passos:
• Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
• Armazene em uma variavel inteira (simples) a soma entre os valores das posicoes A[0], A[1] e A[5]
do vetor e mostre na tela esta soma.
• Modifique o vetor na posicao 4, atribuindo a esta posicao o valor 100.
• Mostre na tela cada valor do vetor A, um em cada linha. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = { 1, 0, 5, -2, -5, 7 };
        int x;
        x = A[0] + A[1] + A[5];
        System.out.println("Resultado: " + x);
        A[4] = 100;
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        sc.close();
    }
}