/*4. Crie uma funcao recursiva que receba dois inteiros positivos k e n e calcule kn. */

import java.util.*;

public class ex4 {
    public static int calculakn(int k, int n) {
        if (n == 1) {
            return k;
        } else {
            return k * calculakn(k, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n;
        System.out.println("Digite 2 números");
        k = sc.nextInt();
        n = sc.nextInt();
        System.out.println("O resultado do primeiro número elevado ao segundo é: " + calculakn(k, n));
        sc.close();
    }
}