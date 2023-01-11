/*13. Faca um programa que leia um vetor de 10 posicoes e verifique se existem valores iguais e os escreva na
tela. */

import java.util.*;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        for (int j = 0; j < vet.length; j++) {
            for (int k = j + 1; k < vet.length; k++) {
                if (vet[j] == vet[k]) {
                    System.out.println("O número " + vet[k] + " aparece mais de uma vez.");
                }
            }
        }
        sc.close();
    }
}