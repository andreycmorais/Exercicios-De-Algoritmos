/*12. Fazer um programa para ler 5 valores e, em seguida, mostrar a posicao onde se encontram o maior e o
menor valor. */

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int menor = 9999, maior = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = i;
            }
            if (vet[i] < menor) {
                menor = i;
            }
        }
        System.out.println(
                "O maior valor encontra-se na posição " + maior + ", e o menor valor está na posição " + menor);
        sc.close();
    }
}
