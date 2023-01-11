/*16. Faca um programa que leia 2 notas de um aluno, verifique se as notas sao validas e exiba na tela a media
destas notas. Uma nota valida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a nota
nao possua um valor valido, este fato deve ser informado ao usuario e o programa termina. */

import java.util.*;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;
        System.out.println("Digite as notas do aluno");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        if (n1 >= 0.0 && n1 <= 10.0 && n2 >= 0.0 && n2 <= 10.0) {
            media = (n1 + n2) / 2;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Nota (s) inválida (s).");
        }
        sc.close();
    }
}