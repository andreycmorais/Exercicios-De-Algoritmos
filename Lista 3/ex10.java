/*10. Faca um programa que calcule e mostre a soma dos 50 primeiros numeros pares. */

public class ex10 {
    public static void main(String[] args) {
        int n, soma = 0;
        for (n = 0; n <= 100; n++) {
            if (n % 2 == 0) {
                soma += n;
            }
        }
        System.out.print(soma);
    }
}