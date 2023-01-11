/*7. Faca um programa que leia 10 inteiros positivos, ignorando nao positivos, e imprima sua media. */

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, media = 0, divisor = 0;
        for (i = 0; i <= 9; i++) {
            n = sc.nextInt();
            if (n < 0) {
                i++;
            } else {
                media += n;
                i++;
                divisor++;
            }
        }
        media = media / divisor;
        System.out.println(media);
        sc.close();
    }
}