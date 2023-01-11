/*6. Faca um programa que receba do usuario um vetor com 10 posicoes. Em seguida devera ser impresso o
maior e o menor elemento do vetor. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int maior = 0, menor = 9999;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        System.out.println("Maior valor: " + maior + " , e menor valor: " + menor);
        sc.close();
    }
}