/*17. Faca um programa que apresente um menu de opcoes para o calculo das seguintes operacoes entre dois
numeros:
• adicao (opcao 1)
• subtracao (opcao 2)
• multiplicacao (opcao 3)
• divisao (opcao 4).
• saıda (opcao 5)
O programa deve possibilitar ao usuario a escolha da operacao desejada, a exibicao do resultado e a
volta ao menu de opcoes. O programa so termina quando for escolhida a opcao de saıda (opcao 5). */

import java.util.*;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0, n1, n2;
        float resultado;
        while (opcao != 5) {
            System.out.println(
                    "Escolha a opção desejada: '1' - Soma, '2' - Subtração, '3' - Multiplicação, '4' - Divisão, '5' - Encerrar o programa.");
            opcao = sc.nextInt();
            System.out.println("Agora digite os números");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (opcao == 1) {
                resultado = n1 + n2;
                System.out.println(resultado);
            } else if (opcao == 2) {
                resultado = n1 - n2;
                System.out.println(resultado);
            } else if (opcao == 3) {
                resultado = n1 * n2;
                System.out.println(resultado);
            } else if (opcao == 4) {
                resultado = n1 / n2;
                System.out.println(resultado);
            } else if (opcao == 5) {
                System.out.println("Programa encerrado.");
            }
        }
        sc.close();
    }
}
