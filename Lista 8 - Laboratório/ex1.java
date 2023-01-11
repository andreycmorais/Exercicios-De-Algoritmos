/*1. Faca uma funcao que receba dois numeros inteiros positivos por parametro e retorne a soma dos N
numeros inteiros existentes entre eles.*/

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        soma = calculaSoma(n1, n2);
        System.out.println(soma);
        sc.close();
    }

    public static int calculaSoma(int n1, int n2) {
        int i, soma = 0;
        for (i = n1; i <= n2; i++) {
            soma += i;
        }
        return soma;
    }
}
