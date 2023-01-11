/*9. Faca um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a
media geral. */

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[15];
        float soma = 0, media;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextFloat();
            soma += notas[i];
        }
        media = soma / 15;
        System.out.println("A média das notas foi " + media);
        sc.close();
    }
}