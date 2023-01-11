/*6. A multiplicacao de dois numeros inteiros pode ser feita atraves de somas sucessivas. Proponha um
algoritmo recursivo Multip Rec(n1,n2) que calcule a multiplicacao de dois inteiros. */

import java.util.*;

public class ex6 {
    public static int multRec(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        } else {
            return a + multRec(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite 2 números");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("A multiplicação dos dois números é: " + multRec(a, b));
        sc.close();
    }
}
