/*8.Escreva um programa que leia 10 numeros e escreva o menor valor lido e o maior valor lido.*/

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, maior = 0, menor = 0;
        for (i = 0; i <= 9; i++) {
            n = sc.nextInt();
            if (i == 0) {
                maior = n;
                menor = n;
            } else if (n > maior) {
                maior = n;
            } else if (n < menor) {
                menor = n;
            }
        }
        System.out.println("Menor: " + menor + ", maior: " + maior);
        sc.close();
    }
}