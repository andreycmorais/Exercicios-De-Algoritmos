/*3. Fac¸a uma funcao recursiva que calcule o valor da serie S descrita a seguir para um valor n > 0 a ser
fornecido como parametro para a mesma.
S = 2 + 5
2 + 10
3 + ... + 1+n2 / n*/

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Qual o valor de n?");
        n = sc.nextInt();
        System.out.println(somaS(n));
        sc.close();
    }

    public static double somaS(int n) {
        double soma = 0;
        if (n == 0) {
            return soma;
        } else {
            soma = soma + (1 + Math.pow(n, 2)) / n;
            return somaS(n - 1) + soma;
        }
    }
}