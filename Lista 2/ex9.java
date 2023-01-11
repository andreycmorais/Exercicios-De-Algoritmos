/*9. Leia uma data de nascimento de uma pessoa fornecida atraves de tres numeros inteiros: Dia, Mes e Ano.
Teste a validade desta data para saber se esta é uma data valida. Teste se o dia fornecido é um dia valido:
dia > 0, dia ≤ 28 para o mes de fevereiro (29 se o ano for bissexto), dia ≤ 30 em abril, junho, setembro
e novembro, dia ≤ 31 nos outros meses. Teste a validade do mes: mes > 0 e mes < 13. Teste a validade
do ano: ano ≤ ano atual (use uma constante definida com o valor igual a 2008). Imprimir: data valida
ou data invalida no final da execucao do programa. */

import java.util.*;

public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();
        String dataValida = "Data válida";
        String dataInvalida = "Data inválida";

        if (mes == 2) {
            if (ano % 100 != 0 && ano % 4 == 0) {
                if (dia <= 29) {
                    System.out.println(dataValida);
                } else {
                    System.out.println(dataInvalida);
                }
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= 30) {
                System.out.println(dataValida);
            } else {
                System.out.println(dataInvalida);
            }
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11) {
            if (dia <= 31) {
                System.out.println(dataValida);
            } else {
                System.out.println(dataInvalida);
            }
        }
        sc.close();
    }
}