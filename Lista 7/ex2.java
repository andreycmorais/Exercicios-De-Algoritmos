/*2. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        sc.close();
    }
}
