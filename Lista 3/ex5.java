/*5. Faca um programa que peca ao usuario para digitar 10 valores e some-os. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma = 0, i;
        System.out.println("Digite 10 números");
        for (i = 0; i <= 9; i++) {
            n = sc.nextInt();
            soma += n;
        }
        System.out.println(soma);
        sc.close();
    }
}
