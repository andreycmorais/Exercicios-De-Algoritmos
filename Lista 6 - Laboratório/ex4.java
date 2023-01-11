/*4. Faca um programa que leia varios numeros, calcule e mostre:
• A soma dos numeros digitados.
• A quantidade de numeros digitados.
• A media dos numeros digitados.
• O maior numero digitado.
• O menor numero digitado.
• A media dos numeros pares.
Finalize a entrada de dados caso o usuario informe o valor 0. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, soma = 0, qtdepares = 0, qtde = 0, media = 0, maiorn = 0, menorn = 0, mediapares = 0, somapares = 0;
        while (n != 0) {
            n = sc.nextInt();
            n++;
            qtde++;
            soma += n;
            media = soma / qtde;
            if (n % 2 == 0) {
                qtdepares++;
                somapares += n;
                mediapares = somapares / qtdepares;
            }
            if (maiorn > n) {
                maiorn = maiorn;
            }
            if (menorn < n) {
                menorn = menorn;
            }
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade de números: " + qtde);
            System.out.println("Média: " + media);
            System.out.println("Menor número: " + menorn);
            System.out.println("Maior número: " + maiorn);
            System.out.println("Média dos pares: " + mediapares);
        }
        sc.close();
    }
}