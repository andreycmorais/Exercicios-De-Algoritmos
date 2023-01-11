/*1. Escreva um programa que leia um numero inteiro de até 4 algarismos maior do que zero e devolva, na tela, a soma de todos
os seus algarismos. Por exemplo, ao numero 251 correspondera o valor 8 (2 + 5 + 1). Se o numero lido
nao for maior do que zero, o programa terminara com a mensagem "Numero invalido". */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma, unidade, dezena, centena, milhar;
        System.out.println("Digite um número de até 4 algarismos");
        numero = sc.nextInt();
        if (numero > 0) {
            if (numero <= 99) {
                dezena = numero / 10;
                numero = numero % 10;
                unidade = numero;
                soma = unidade + dezena;
                System.out.println("A soma dos algarismos é: " + soma);
            } else if (numero >= 100 && numero <= 999) {
                centena = numero / 100;
                numero = numero % 100;
                dezena = numero / 10;
                numero = numero % 10;
                unidade = numero;
                soma = unidade + dezena + centena;
                System.out.println("A soma dos algarismos é: " + soma);
            } else if (numero >= 1000 && numero <= 9999) {
                milhar = numero / 1000;
                numero = numero % 1000;
                centena = numero / 100;
                numero = numero % 100;
                dezena = numero / 10;
                numero = numero % 10;
                unidade = numero;
                soma = unidade + dezena + centena + milhar;
                System.out.println("A soma dos algarismos é: " + soma);
            }
        } else {
            System.out.println("Número inválido.");
        }
        sc.close();
    }
}