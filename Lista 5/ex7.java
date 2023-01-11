/*7. Elabore uma funcao que receba tres notas de um aluno como parametros e uma letra. Se a letra for
A, a funcao devera calcular a media aritmetica das notas do aluno; se for P, devera calcular a media
ponderada, com pesos 5, 3 e 2. */

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        char letra;
        System.out.println("Digite as notas do aluno");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        System.out
                .println("Agora digite a média que quer saber: 'A' para média aritmética ou 'P' para média ponderada.");
        letra = sc.next().charAt(0);
        System.out.println("A média escolhida é: " + calculaMedia(n1, n2, n3, letra));
        sc.close();
    }

    public static double calculaMedia(float n1, float n2, float n3, char letra) {
        double media = 0;
        if (letra == 'A') {
            media = (n1 + n2 + n3) / 3;
        } else if (letra == 'P') {
            media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
        }
        return media;
    }
}