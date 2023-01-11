/*10. Faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas trabalhadas no
mes. Imprima o valor a ser pago ao funcionario, adicionando 10% sobre o valor calculado. */

import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHora, horasTrabalhadas, valor, valorPago;
        System.out.println("Qual o valor da hora de trabalho?");
        valorHora = sc.nextDouble();
        System.out.println("Quantas horas o funcionário trabalhou?");
        horasTrabalhadas = sc.nextDouble();
        valor = valorHora * horasTrabalhadas;
        valorPago = valor + ((valor * 10) / 100);
        System.out.println("O valor total a ser pago é de R$ " + valorPago);
        sc.close();
    }
}