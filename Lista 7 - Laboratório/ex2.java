/*2. Escreva um programa que receba como entrada o valor do saque realizado pelo cliente de um banco e
retorne quantas notas de cada valor serao necessarias para atender ao saque com a menor quantidade
de notas possıvel. Serao utilizadas notas de 100, 50, 20, 10, 5, 2 e 1 real. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saque;
        System.out.println("Qual o valor do saque? ");
        saque = sc.nextInt();
        if (saque <= 0) {
            System.out.println("Valor inválido");
        } else {
            System.out.println("Quantidade de cédulas de 100: " + saque / 100);
            System.out.println("Quantidade de cédulas de 50: " + saque / 50);
            System.out.println("Quantidade de cédulas de 20: " + saque / 20);
            System.out.println("Quantidade de cédulas de 10: " + saque / 10);
            System.out.println("Quantidade de cédulas de 5: " + saque / 5);
            System.out.println("Quantidade de cédulas de 2: " + saque / 2);
            System.out.println("Quantidade de cédulas de 1: " + saque / 1);
        }
        sc.close();
    }
}
