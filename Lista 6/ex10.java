/*10. Faca uma funcao recursiva que receba um numero inteiro positivo par N e imprima todos os numeros
pares de 0 ate N em ordem decrescente. */

import java.util.*;

public class ex10 {
    public static int naturaisPar(int n) {
        if (n < 0) {
            return 0;
        } else {
            System.out.println(n);
            return naturaisPar(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número par");
        n = sc.nextInt();
        System.out.println(naturaisPar(n));
        sc.close();
    }
}