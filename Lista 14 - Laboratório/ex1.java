/*1. Leia duas cadeias de caracteres A e B. Determine quantas vezes a cadeia A ocorre na cadeia B. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase e/ou palavras: ");
        String cadeia = sc.nextLine();

        System.out.println("Selecione uma palavra a ser verificada na cadeia: ");
        String palavra = sc.nextLine();

        int contador = 0;
        int posicao = cadeia.indexOf(palavra);
        while (posicao != -1) {
            contador++;
            posicao = cadeia.indexOf(palavra, posicao + palavra.length());
        }
        System.out.println(contador);
        sc.close();
    }
}