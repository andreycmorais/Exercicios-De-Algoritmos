/*14. Leia um numero positivo do usuario, entao, calcule e imprima a sequencia Fibonacci ate o primeiro
numero superior ao numero lido. Exemplo: se o usuario informou o numero 30, a sequencia a ser
impressa sera 0 1 1 2 3 5 8 13 21 34. */

import java.util.*;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c = 0, cont = 2;
        n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            cont++;
            System.out.println(c);
        }
        sc.close();
    }
}