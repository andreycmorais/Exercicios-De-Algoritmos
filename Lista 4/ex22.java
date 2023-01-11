/*22. Escreva um programa que receba como entrada o valor do saque realizado pelo cliente de um banco e
retorne quantas notas de cada valor serao necessarias para atender ao saque com a menor quantidade
de notas possıvel. Serao utilizadas notas de 100, 50, 20, 10, 5, 2 e 1 real. */

import java.util.*;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saque, nota1, nota2, nota5, nota10, nota20, nota50, nota100;
        System.out.println("Digite o valor do saque");
        saque = sc.nextInt();
        nota100 = saque / 100;
        saque = saque % 100;
        nota50 = saque / 50;
        saque = saque % 50;
        nota20 = saque / 20;
        saque = saque % 20;
        nota10 = saque / 10;
        saque = saque % 10;
        nota5 = saque / 5;
        saque = saque % 5;
        nota2 = saque / 2;
        saque = saque % 2;
        nota1 = saque;
        System.out.println("Serão necessárias " + nota100 + " notas de R$ 100,00");
        System.out.println("Serão necessárias " + nota50 + " notas de R$ 50,00");
        System.out.println("Serão necessárias " + nota20 + " notas de R$ 20,00");
        System.out.println("Serão necessárias " + nota10 + " notas de R$ 10,00");
        System.out.println("Serão necessárias " + nota5 + " notas de R$ 5,00");
        System.out.println("Serão necessárias " + nota2 + " notas de R$ 2,00");
        System.out.println("Serão necessárias " + nota1 + " notas de R$ 1,00");
        sc.close();
    }
}