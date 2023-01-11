/*5. Faca um algoritmo estruturado que leia uma quantidade nao determinada de numeros positivos. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        while (n >= 0) {
            System.out.println("Digite um número");
            n = sc.nextInt();
        }
        sc.close();
    }
}