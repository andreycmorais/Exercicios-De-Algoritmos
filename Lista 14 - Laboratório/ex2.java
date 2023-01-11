/*2. Faca um programa que contenha um menu com as seguintes opcoes:
• Ler uma string S1 (tamanho maximo 20 caracteres);
• Imprimir o tamanho da string S1;
• Comparar a string S1 com uma nova string S2 fornecida pelo usuario e imprimir o resultado da
comparacao;
• Concatenar a string S1 com uma nova string S2 e imprimir na tela o resultado da concatenacao;
• Imprimir a string S1 de forma reversa;
• Contar quantas vezes um dado caractere aparece na string S1. Esse caractere desse ser informado
pelo usuario;
• Substituir a primeira ocorrencia do caractere C1 da string S1 pelo caractere C2. Os caracteres C1 e
C2 serao lidos pelo usuario;
• Verificar se uma string S2 é substring de S1. A string S2 deve ser informada pelo usuario;
• Retornar uma substring da string S1. Para isso o usuario deve informar a partir de qual posicao
deve ser criada a substring e qual é o tamanho da substring. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase ou palavra de no máximo 20 caracteres");
        String s1 = sc.nextLine();
        System.out.println("O tamanho é: " + s1.length());
        System.out.println("Digite outra frase ou palavra de no máximo 20 caracteres");
        String s2 = sc.nextLine();
        if (s1.equals(s2)) {
            System.out.println("São iguais.");
        } else {
            System.out.println("Não são iguais.");
        }
        System.out.println(s1 + s2);
        System.out.println(new StringBuilder(s1).reverse().toString());
    }
}