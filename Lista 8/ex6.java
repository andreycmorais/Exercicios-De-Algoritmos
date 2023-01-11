/*6. Escreva um programa que leia numeros inteiros no intervalo [0,50] e os armazene em um vetor com 10
posicoes. Preencha um segundo vetor apenas com os numeros ́ımpares do primeiro vetor. Imprima os
dois vetores, 2 elementos por linha. */
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] vet = new int[10];
        int[] impar = new int[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rd.nextInt(50);
            if (vet[i] % 2 != 0) {
                impar[i] = vet[i];
            } else {
                impar[i] = 0;
            }
            System.out.print("Vetor completo: " + vet[i]);
            if (impar[i] != 0) {
                System.out.print("Vetor de números ímpares: " + impar[i]);
            }
        }
    }
}
