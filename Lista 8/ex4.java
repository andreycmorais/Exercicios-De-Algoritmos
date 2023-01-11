/*4. Faca um programa que leia um vetor de 10 numeros. Leia um numero x. Conte os multiplos de um
numero inteiro x num vetor e mostre-os na tela. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int[] mult = new int[10];
        int x;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        x = sc.nextInt();
        for (int i = 0; i < mult.length; i++) {
            if (vet[i] % x == 0) {
                mult[i] = vet[i];
            }
            System.out.print("São múltiplos do x: " + mult[i] + "/");
        }
        sc.close();
    }
}
