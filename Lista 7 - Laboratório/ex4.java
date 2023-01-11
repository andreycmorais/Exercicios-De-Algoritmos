/*4. Escreva um programa que leia um inteiro nao negativo n e imprima a soma dos n primeiros numeros
primos. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, primos, i = 1;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if (num > 0) {
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                }
            }
        }
        sc.close();
    }
}
