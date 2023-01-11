/*20. Faca um algoritmo que calcule o IMC de uma pessoa e mostre sua classificacao de acordo com a tabela
abaixo:
IMC - Classificacao
< 18,5 - Abaixo do Peso
Entre 18,6 e 24,9 - Saudavel
Entre 25,0 e 29,9 - Peso em excesso
Entre 30,0 e 34,9 - Obesidade Grau I
Entre 35,0 e 39,9 - Obesidade Grau II (severa)
≥ 40,0 - Obesidade Grau III (morbida) */

import java.util.*;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, alt, imc;
        System.out.println("Digite o peso e a altura da pessoa");
        peso = sc.nextFloat();
        alt = sc.nextFloat();
        imc = peso / (alt * alt);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Peso em excesso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }
        sc.close();
    }
}