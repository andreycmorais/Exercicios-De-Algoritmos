/*10. Faca um programa que preencha um vetor com 10 numeros reais, calcule e mostre a quantidade de
numeros negativos e a soma dos numeros positivos desse vetor. */

import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[10];
        int qtdenegativos = 0, soma = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextFloat();
            if (vet[i] < 0) {
                qtdenegativos++;
            } else {
                soma += vet[i];
            }
        }
        System.out.println("São " + qtdenegativos + " números negativos, e a soma dos positivos é " + soma);
        sc.close();
    }
}