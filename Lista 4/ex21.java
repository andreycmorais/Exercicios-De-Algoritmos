/*21. Um funcionario recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu
aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faca
programa que determine o salario atual do funcionario. */

public class ex21 {
    public static void main(String[] args) {
        int ano;
        double salario = 2000, aumento = 1.5;
        salario = salario + (salario * aumento / 100);
        System.out.println(salario);
        aumento *= 2;
        for (ano = 1997; ano <= 2022; ano++) {
            salario = salario + (salario * aumento / 100);
            aumento *= 2;
            System.out.println(salario);
        }
    }
}