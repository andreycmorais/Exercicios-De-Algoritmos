/*4. Faca um programa que calcule o menor numero divisıvel por cada um dos numeros de 1 a 20? Ex: 2520
e o menor numero que pode ser dividido por cada um dos numeros de 1 a 10, sem sobrar resto. */

public class ex4 {
    public static void main(String[] args) {
        int i, divisor, valor = 20;
        do {
            divisor = 0;
            valor += 2;
            for (i = 1; i <= 20; i++) {
                if (valor % i == 0) {
                    divisor++;
                }
            }
        } while (divisor != 20);
        System.out.println(valor);
    }
}
