/*1. Desenvolver um algoritmo que efetue a soma de todos os numeros ımpares que sao multiplos de tres e
que se encontram no conjunto dos numeros de 1 ate 500. */

public class ex1 {
    public static void main(String[] args) {
        int soma = 0;
        for (int n = 1; n <= 500; n++) {
            if (n % 3 == 0 && n % 2 == 1) {
                soma += n;
            }
        }
        System.out.println(soma);
    }
}