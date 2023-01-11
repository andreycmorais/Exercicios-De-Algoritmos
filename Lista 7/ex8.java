/*8. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos na ordem
inversa. */

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(vet[i]);
        }
        sc.close();
    }
}