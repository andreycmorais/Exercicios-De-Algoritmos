/*6. Faca um programa que leia 10 inteiros e imprima sua media. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma = 0, media = 0, i;
        for (i = 0; i <= 9; i++) {
            n = sc.nextInt();
            soma += n;
            media = soma / 10;
        }
        System.out.println(media);
        sc.close();
    }
}