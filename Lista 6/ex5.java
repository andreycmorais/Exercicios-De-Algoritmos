/*5. Faca uma funcao recursiva que calcule e retorne o N-esimo termo da sequencia Fibonacci. Alguns
numeros desta sequencia sao: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... */

import java.util.*;

public class ex5 {
    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println("O número digitado correspondente na sequência de fibonacci é: " + fibonacci(n));
        sc.close();
    }
}
