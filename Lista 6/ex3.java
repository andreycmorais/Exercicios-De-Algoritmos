/*3. Escreva uma funcao recursiva que calcule a soma dos primeiros n cubos: S(n) = 1³ + 2³ + ... + n³ */

import java.util.*;

public class ex3 {
    public static double somaCubos(double n) {
        if (n == 0) {
            return 0;
        } else {
            return (somaCubos(n - 1) + (Math.pow(n, 3)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println("A soma dos cubos dos números até o número digitado é: " + somaCubos(n));
        sc.close();
    }
}
