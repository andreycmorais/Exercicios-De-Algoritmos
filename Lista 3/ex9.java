/*9. Faca um programa que leia um numero inteiro N e depois imprima os N primeiros numeros naturais ımpares.*/

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }
        sc.close();
    }
}