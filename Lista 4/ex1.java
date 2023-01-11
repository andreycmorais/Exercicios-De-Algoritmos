/*1. Faca um programa que calcule e escreva o valor de S:
S = 1
1 + 3
2 + 5
3 + 7
4 + ... + 99
50 */

public class ex1 {
    public static void main(String[] args) {
        int x, y = 1, soma = 0;
        for (x = 1, y = 1; x <= 99; x += 2, y++) {
            soma = x / y;
        }
        System.out.println(soma);
    }
}