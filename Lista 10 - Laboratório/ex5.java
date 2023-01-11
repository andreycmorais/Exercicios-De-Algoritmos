/*5. Crie um programa que solicite a entrada de 10 numeros pelo usuario, armazenando-os em um vetor,
e entao monte outro vetor com os valores do primeiro multiplicados por 5. Exiba os valores dos dois
vetores na tela, simultaneamente, em duas colunas (um em cada coluna), uma posicao por linha. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int i;
        for (i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            y[i] = x[i] * 5;
            System.out.println(x[i] + " " + y[i]);
        }
        sc.close();
    }
}