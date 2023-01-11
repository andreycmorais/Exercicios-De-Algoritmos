/*12. Faca um programa que leia um numero inteiro positivo de tres dıgitos (de 100 a 999). Gere outro numero
formado pelos dıgitos invertidos do numero lido. Exemplo: numeroLido = 123, numeroGerado = 321. */

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLido, numeroGerado, unidade, dezena, centena;
        System.out.println("Digite um número entre 100 e 999");
        numeroLido = sc.nextInt();
        unidade = numeroLido % 10;
        dezena = (numeroLido % 100) / 10;
        centena = numeroLido / 100;
        numeroGerado = unidade * 100 + dezena * 10 + centena;
        System.out.println("O número invertido é: " + numeroGerado);
        sc.close();
    }
}
