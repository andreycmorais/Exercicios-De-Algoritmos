/*4. Faca uma funcao para realizar o calculo fatorial de maneira recursiva. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(fatorial(n));
        sc.close();
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fatorial(n - 1));
        }
    }
}
