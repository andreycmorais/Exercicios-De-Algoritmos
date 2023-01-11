/*2. Faca um programa que leia um vetor de 5 posicoes para numeros reais e, depois, um ćodigo inteiro. Se o
codigo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na
ordem inversa. Caso, o codigo for diferente de 1 e 2 escreva uma mensagem informando que o codigo é
invalido. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];
        int opcao;
        boolean ligar = true;
        System.out.println("Digite a opção 0, 1 ou 2");
        opcao = sc.nextInt();
        while (ligar) {
            switch (opcao) {
                case 0:
                    ligar = false;
                    break;
                case 1:
                    for (int i = 0; i < vet.length; i++) {
                        System.out.println("Digite um numero");
                        vet[i] = sc.nextDouble();
                    }
                    for (int i = 0; i < vet.length; i++) {
                        System.out.println(vet[i]);
                    }
                    System.out.println("Digite a opção 0, 1 ou 2");
                    opcao = sc.nextInt();
                    break;
                case 2:
                    for (int i = 0; i < vet.length; i++) {
                        System.out.println("Digite um numero");
                        vet[i] = sc.nextDouble();
                    }
                    for (int i = 4; i >= 0; i--) {
                        System.out.println(vet[i]);
                    }
                    System.out.println("Digite a opção 0, 1 ou 2");
                    opcao = sc.nextInt();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}
