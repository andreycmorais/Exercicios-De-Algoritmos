/*1. Faca um programa que conte quantos numeros primos existem entre a e b, onde a e b sao numeros
informados pelo usuario. */

import java.util.*;

public class ex1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int primo, a, b, i, j;
        a = sc.nextInt();
        b = sc.nextInt();
        for (i = a; i <= b; i++) {
            primo = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
                if (primo == 2) {
                    System.out.println (primo);
                }
            }
        }
        sc.close();
    }
}