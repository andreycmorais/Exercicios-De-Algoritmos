/*2. Faca uma funcao recursiva que calcule e retorne o fatorial de um numero inteiro N. */

import java.util.*;

public class ex2 {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um número");
        valor = sc.nextInt();
        System.out.println("O fatorial do número digitado é: " + fatorial(valor));
        sc.close();
    }
}
