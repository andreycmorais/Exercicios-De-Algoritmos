/*8. Faca uma prova de matematica para criancas que estao aprendendo a somar numeros inteiros menores
do que 100. Escolha numeros aleatorios entre 1 e 100, e mostre na tela a pergunta: qual e a soma de a +
b, onde a e b sao os numeros aleatorios. Peca a resposta. Faca cinco perguntas ao aluno, e mostre para
ele as perguntas e as respostas corretas, alem de quantas vezes o aluno acertou. */

import java.util.*;
import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int i, a, b, acertos = 0;
        int resposta;
        for (i = 0; i < 5; i++) {
            a = rd.nextInt(100);
            b = rd.nextInt(100);
            System.out.println("Qual a soma de " + a + " + " + b + " ?");
            resposta = sc.nextInt();
            if (resposta == (a + b)) {
                System.out.println("Resposta correta");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }
        }
        System.out.println("Você acertou " + acertos + " questões!");
        sc.close();
    }
}