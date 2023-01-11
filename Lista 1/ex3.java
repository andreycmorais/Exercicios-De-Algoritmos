/*3. Peca ao usuario para digitar tres valores inteiros e imprima a soma deles. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite três números inteiros");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        System.out.println("A soma dos números é: " + (n1 + n2 + n3));
        sc.close();
    }
}