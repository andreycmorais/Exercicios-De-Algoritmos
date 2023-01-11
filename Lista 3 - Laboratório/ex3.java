/*3. Faca um algoritmo que calcule a media ponderada das notas de 3 provas. A primeira e a segunda prova
tem peso 1 e a terceira tem peso 2. Ao final, mostrar a media do aluno e indicar se o aluno foi aprovado
ou reprovado. A nota para aprovacao deve ser igual ou superior a 60 pontos. */

/*A média aritmética ponderada é calculada multiplicando cada valor do conjunto de dados pelo seu peso.
Depois, encontra-se a soma desses valores que será dividida pela soma dos pesos. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, media, soma;
        System.out.println("Digite a nota da primeira prova");
        nota1 = sc.nextFloat();
        System.out.println("Digite a nota da segunda prova");
        nota2 = sc.nextFloat();
        System.out.println("Digite a nota da terceira prova");
        nota3 = sc.nextFloat();
        nota1 = nota1 * 1;
        nota2 = nota2 * 1;
        nota3 = nota3 * 2;
        soma = nota1 + nota2 + nota3;
        media = soma / 4;
        if (media >= 60) {
            System.out.println("Aluno aprovado com " + media);
        } else {
            System.out.println("Aluno reprovado com " + media);
        }
        sc.close();
    }
}