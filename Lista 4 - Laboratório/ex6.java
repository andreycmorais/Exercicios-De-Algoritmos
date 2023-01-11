/*6. Calcule a quantidade de numeros pares e ımpares, a media de valores pares e a media geral dos numeros
lidos. O numero que encerrara a leitura sera zero. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, qtdePar = 0, qtdeImpar = 0, soma = 0, media, mediaPar, somaPar = 0;
        System.out.println("Digite um número");
        n = sc.nextInt();
        while (n != 0) {
            System.out.println("Digite um número");
            n = sc.nextInt();
            if (n % 2 == 0) {
                qtdePar++;
                somaPar += n;
            } else if (n % 2 == 1) {
                qtdeImpar++;
            }
            soma += n;
        }
        mediaPar = somaPar / qtdePar;
        media = soma / (qtdePar + qtdeImpar);
        System.out.println("Quantidade de números pares: " + qtdePar);
        System.out.println("Quantidade de números ímpares: " + qtdeImpar);
        System.out.println("Média de números pares: " + mediaPar);
        System.out.println("Média de todos os números: " + media);
        sc.close();
    }
}