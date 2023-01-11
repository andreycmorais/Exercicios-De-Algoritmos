/*20. Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre: o total a
pagar com desconto de 10%; o valor de cada parcela, no parcelamento de 3× sem juros; a comissao do
vendedor, no caso da venda ser parcelada (5% sobre o valor total). */

import java.util.*;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor, totalPago, valorParcela, comissao;
        System.out.println("Digite o valor");
        valor = sc.nextFloat();
        totalPago = valor - (valor * 10) / 100;
        valorParcela = valor / 3;
        comissao = valor * 5 / 100;
        System.out.println("O total a ser pago é: " + totalPago + " reais.");
        System.out.println("O valor da parcela é: " + valorParcela + " reais.");
        System.out.println("A comissão é de: " + comissao + " reais.");
        sc.close();
    }
}