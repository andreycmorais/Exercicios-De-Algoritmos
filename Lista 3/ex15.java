/*15. Faca um programa que leia um numero inteiro positivo ımpar N e imprima todos os numeros impares de
1 ate N em ordem crescente. */

import java.util.*;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for (i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}