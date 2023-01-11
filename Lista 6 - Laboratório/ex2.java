/*2. Faca um programa que some os numeros primos existentes entre a e b, onde a e b sao numeros informados
pelo usuario. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, num, i, primo, soma = 0;
        System.out.println("Informe a: ");
        a = sc.nextInt();
        System.out.println("Informe b: ");
        b = sc.nextInt();
        if (a > b) {
            i = a;
            a = b;
            b = i;
        }
        for (num = a; num <= b; num++) {
            primo = 0;
            for (i = 2; i < num; i++) {
                if (num % i == 0)
                    primo = 1;
                if (primo == 0) {
                    soma += num;
                }
            }
        }
        if (soma > 0) {
            System.out.println("Soma dos primos em : " + a + b + soma);
        } else {
            System.out.println("Não existem primos no intervalo " + a + b);
        }
    }
}