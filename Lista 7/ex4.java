/*4. Faca um programa que leia um vetor de 8 posicoes e, em seguida, leia tambem dois valores X e Y
quaisquer correspondentes a duas posicoes no vetor. Ao final seu programa devera escrever a soma dos
valores encontrados nas respectivas posicoes X e Y . */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int[] vet = new int[8];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        x = vet[5];
        y = vet[7];
        System.out.println(x + y);
        sc.close();
    }
}
