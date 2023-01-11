/*10. Elabore um programa que faca a leitura de varios numeros inteiros, ate que se digite um numero negativo.
O programa tem que retornar o maior e o menor numero lido. */

import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, maior = 0, menor = 0;
        while (n >= 0) {
            n = sc.nextInt();
            if (n == 0) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("Maior: " + maior + ", e menor: " + menor);
        sc.close();
    }
}