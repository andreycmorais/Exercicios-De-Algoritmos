/*6. Faca um programa que calcule a diferenca entre a soma dos quadrados dos primeiros 100 numeros
naturais e o quadrado da soma. Ex: A soma dos quadrados dos dez primeiros numeros naturais e:
12+22+...102 = 385 O quadrado das soma dos dez primeiros numeros naturais e: (1+2+...+10)2 = 3025
A diferenca entre a soma dos quadrados dos dez primeiros numeros naturais e o quadrado da soma e
3025 − 385 = 2640. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        int n, qdsoma = 0, soman = 0, somaqd = 0;
        for (n = 1; n <= 100; n++) {
            qdsoma += n * n;
            soman += n;
            somaqd = soman * soman;
        }
        System.out.println(somaqd - qdsoma);
    }
}
