/*1. Um funcionario recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu
aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faca
programa que determine o salario atual do funcionario. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, i = 1997;
        double salario = 2000, novo_salario, percentual, novo_percentual;
        System.out.println("Digite o ano atual: ");
        ano = sc.nextInt();
        percentual = salario * 0.015;
        novo_salario = salario + percentual;
        if (ano < 1997) {

            System.out.println(" ERRO ");
            System.out.println("Digite um valor maior que: 1997");
        }
        while (i >= ano) {
            novo_percentual = novo_salario * 0.03;
            novo_salario = novo_salario + percentual + novo_percentual;
            i++;
        }
        System.out.println("Novo salário: " + novo_salario);
        sc.close();
    }
}
