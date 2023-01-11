/*2. Faca um programa que simula o lancamento de dois dados, d1 e d2, n vezes, e tem como saıda o numero
de cada dado e a relacao entre eles (>,<,=) de cada lancamento. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1, d2, n, i = 0;
        System.out.println("Quantos números quer verificar?");
        n = sc.nextInt();
        while (i < n) {
            d1 = sc.nextInt();
            d2 = sc.nextInt();
            if (d1 > d2) {
                System.out.println(d1 + " é > que " + d2);
            } else if (d1 < d2) {
                System.out.println(d1 + " é < que " + d2);
            } else {
                System.out.println(d1 + " é igual a " + d2);
            }
            i++;
        }
        sc.close();
    }
}
