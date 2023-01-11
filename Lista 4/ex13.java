/*13. Faca um programa que leia um numero indeterminado de idades de indivıduos (pare quando for
informada a idade 0), e calcule a idade media desse grupo. */

import java.util.*;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 1, soma = 0, qtde = -1;
        float media;
        while (id > 0) {
            id = sc.nextInt();
            soma += id;
            qtde++;
        }
        media = soma / qtde;
        System.out.println("A média de idade é: " + media);
        sc.close();
    }
}