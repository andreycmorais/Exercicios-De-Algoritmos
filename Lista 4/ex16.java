/*16. Faca um programa que gera um numero aleatorio de 1 a 1000. O usuario deve tentar acertar qual o
numero foi gerado, a cada tentativa o programa dever a informar se o chute e menor ou maior que o
numero gerado. O programa acaba quando o usuario acerta o numero gerado. O programa deve informar
em quantas tentativas o numero foi descoberto. */

import java.util.*;
import java.util.Random;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdetenta = 0, chute = 0;
        Random rd = new Random();
        int n = rd.nextInt(1000);
        while (chute != n) {
            chute = sc.nextInt();
            qtdetenta++;
            if (chute > n) {
                System.out.println("Número maior que o certo");
            } else if (chute < n) {
                System.out.println("Número menor que o certo");
            } else {
                System.out.println("Número correto! Você acertou em " + qtdetenta + " tentativas.");
            }
        }
        sc.close();
    }
}