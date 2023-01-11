/*5. Leia um vetor de 10 posicoes. Contar e escrever quantos valores pares ele possui. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int pares = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println("A sequência de números digitadas possui " + pares + " valores pares.");
        sc.close();
    }
}