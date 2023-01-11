/*14. Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mes correspondente a
este numero. Isto é, janeiro se 1, fevereiro se 2, e assim por diante. */

import java.util.*;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número correspondente ao mês que deseja saber");
        n = sc.nextInt();
        if (n <= 12) {
            switch (n) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
            }
        } else {
            System.out.println("Mês Inválido.");
        }
        sc.close();
    }
}
