/*19. Escreva um algoritmo que leia um numero inteiro entre 100 e 999 e imprima na saıda cada um dos
algarismos que compoem o numero */

import java.util.*;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, unidade, dezena, centena;
        n = sc.nextInt();
        if (n >= 100 && n <= 999) {
            centena = n / 100;
            n = n % 100;
            dezena = n / 10;
            n = n % 10;
            unidade = n;
            System.out.println(centena);
            System.out.println(dezena);
            System.out.println(unidade);
        } else {
            System.out.println("Erro");
        }
        sc.close();
    }
}