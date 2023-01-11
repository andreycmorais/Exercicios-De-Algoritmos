/*Faca um programa que leia um valor N inteiro e positivo, calcule o mostre o valor E, conforme a formula
a seguir: */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n, fato = 1, E = 0;
        System.out.println("Digite o valor a n");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fato = fato * i;
            E += 1 / fato;
        }
        System.out.println("O valor de E: " + E);
        sc.close();
    }
}