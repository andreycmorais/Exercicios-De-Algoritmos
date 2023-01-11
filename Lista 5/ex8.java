/*8. Escreva uma funcao que receba um numero inteiro maior do que zero e retorne a soma de todos os seus
algarismos. Por exemplo, ao numero 251 correspondera o valor 8 (2 + 5 + 1). Se o numero lido nao for
maior do que zero, o programa terminara com a mensagem ”Numero invalido”. */

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número maior que zero");
        n = sc.nextInt();
        System.out.println("A soma dos algarismos é: " + somaAlgarismos(n));
        sc.close();
    }

    public static int somaAlgarismos(int n) {
        int n1, n2, n3, soma = 0;
        if (n > 0) {
            n1 = n / 100;
            n = n % 100;
            n2 = n / 10;
            n = n % 10;
            n3 = n;
            soma = n1 + n2 + n3;
        } else {
            System.out.println("Número inválido");
        }
        return soma;
    }
}