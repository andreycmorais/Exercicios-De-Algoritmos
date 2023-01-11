/*4. Leia um numero real e imprima a quinta parte deste numero. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n;
        System.out.println("Digite um número");
        n = sc.nextFloat();
        System.out.println("A quinta parte do número é: " + (n / 5));
        sc.close();
    }
}