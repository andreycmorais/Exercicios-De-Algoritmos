/*1. Crie uma funcao recursiva que receba um numero inteiro positivo N e calcule o somatorio dos numeros
de 1 a N. */

import java.util.*;

public class ex1 {
    public static int soma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + soma(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um número");
        valor = sc.nextInt();
        System.out.println("A soma dos valores de 1 ao número digitado é: " + soma(valor));
        sc.close();
    }
}