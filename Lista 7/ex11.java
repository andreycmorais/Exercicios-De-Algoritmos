/*11. Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos juntamente com o
maior, o menor e a media dos valores. */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int menor = 9999, maior = 0;
        float soma = 0, media;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            soma += vet[i];
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        media = soma / 5;
        System.out.println(
                "O maior valor é " + maior + ", o menor valor é " + menor + " e a média dos valores é " + media);
        sc.close();
    }
}
