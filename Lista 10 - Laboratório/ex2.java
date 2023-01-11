/*2. Altere o programa anterior para calcular e apresentar a media dos valores entrados e aqueles sendo
maiores e menores que a media.*/

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media = 0;
        int soma = 0, i;
        int[] vet = new int[5];
        for (i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        media = soma / 5;
        System.out.println("Média dos valores: " + media);
        for (i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                System.out.println("Valor maior que a média: " + vet[i]);
            } else {
                System.out.println("Valor menor que a média: " + vet[i]);
            }
        }
        sc.close();
    }
}