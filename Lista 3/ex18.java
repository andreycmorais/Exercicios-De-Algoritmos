/*18. Escreva um algoritmo que leia certa quantidade de numeros e imprima o maior deles e quantas vezes o
maior numero foi lido. A quantidade de numeros a serem lidos deve ser fornecida pelo usuario. */

import java.util.*;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, maior = 0, vezesmaior = 1, vezes;
        System.out.println("Quantos números quer ler?");
        vezes = sc.nextInt();
        for (i = 0; i < vezes; i++) {
            n = sc.nextInt();
            if (n == maior) {
                vezesmaior++;
            } else if (n > maior) {
                vezesmaior = 1;
            }
            if (n >= maior) {
                maior = n;
            }
        }
        System.out.println("Maior: " + maior + ", vezes que foi lido: " + vezesmaior);
        sc.close();
    }
}