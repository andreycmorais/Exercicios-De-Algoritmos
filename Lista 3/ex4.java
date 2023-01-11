/*4. Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000,
imprimindo seu valor na tela, ate que seu valor seja 100000 (cem mil) */

public class ex4 {
    public static void main(String[] args) {
        int n;
        for (n = 0; n <= 100000; n+=1000) {
            System.out.println(n);
        }
    }
}