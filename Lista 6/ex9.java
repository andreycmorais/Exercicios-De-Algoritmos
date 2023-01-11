/*9. Faca uma funcao recursiva que receba um numero inteiro positivo par N e imprima todos os numeros
pares de 0 ate N em ordem crescente. */

import java.util.*;

public class ex9 {
    public static int natPares(int n, int y) {
        if (n > 0) {
            while (y <= n) {
                System.out.println(y);
                y += 2;
            }
            return natPares(n - 1, y + 2);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y = 0;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println("Os números pares de 0 ao número digitado são: " + natPares(n, y));
        sc.close();
    }
}
