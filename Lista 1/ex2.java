/*2. Faca um programa que leia um numero real e o imprima. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n;
        System.out.println("Digite um número");
        n = sc.nextFloat();
        System.out.println("O número digitado é: " + n);
        sc.close();
    }
}