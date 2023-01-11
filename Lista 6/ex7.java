/*7. Faca uma funcao recursiva que receba um numero inteiro positivo N e imprima todos os numeros naturais
de 0 ate N em ordem crescente. */

import java.util.*;

public class ex7 {
    public static int natCresc(int n, int y) {
        if (n > 0) {
            System.out.println(y++);
            return natCresc(n - 1, y);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y = 0;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println("Os números de 0 ao número digitado são: " + natCresc(n, y));
        sc.close();
    }
}