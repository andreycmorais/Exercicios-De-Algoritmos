/*18. Faca um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que
o desconto foi de 12%. */

import java.util.*;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor, desconto;
        System.out.println("Digite o valor do produto");
        valor = sc.nextFloat();
        desconto = valor - (valor * 12) / 100;
        System.out.println("O valor com desconto é: " + desconto);
        sc.close();
    }
}