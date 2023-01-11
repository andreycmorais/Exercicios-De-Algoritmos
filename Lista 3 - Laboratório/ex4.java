/*4. Escreva o menu de opcoes abaixo. Leia a opcao do usuario e execute a operacao escolhida. Escreva uma
mensagem de erro se a opcao for invalida. Escolha a opcao:
(a) Soma de 2 numeros
(b) Diferenca entre 2 numeros (maior pelo menor).
(c) Produto entre 2 numeros.
(d) Divisao entre 2 numeros (o denominador nao pode ser zero). */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operacao;
        int n1, n2, resultado = 0;
        System.out.println(
                "Escolha a opção: (a) Soma de dois números, (b) Diferença entre 2 números (maior pelo menor), (c) Produto entre 2 números, (d) Divisao entre 2 numeros (o denominador nao pode ser zero)");
        operacao = sc.next().charAt(0);
        if (operacao != 'a' && operacao != 'b' && operacao != 'c' && operacao != 'd') {
            System.out.println("Opção inválida");
        } else {
            System.out.println("Agora digite os números");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            switch (operacao) {
                case 'a':
                    resultado = n1 + n2;
                    break;
                case 'b':
                    if (n1 > n2) {
                        resultado = n1 - n2;
                    } else if (n1 < n2) {
                        resultado = n2 - n1;
                    } else {
                        System.out.println("Números iguais.");
                    }
                    break;
                case 'c':
                    resultado = n1 * n2;
                    break;
                case 'd':
                    if (n1 > n2) {
                        resultado = n1 / n2;
                    } else if (n1 < n2) {
                        resultado = n2 / n1;
                    } else {
                        System.out.println("Números iguais.");
                    }
                    break;
            }
        }
        System.out.println("O resultado da sua operação é: " + resultado);
        sc.close();
    }
}