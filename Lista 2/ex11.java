/*11. Escreva um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
Categoria - Idade
Infantil A - 5 a 7
Infantil B - 8 a 10
Juvenil A - 11 a 13
Juvenil B - 14 a 17
Senior - maiores de 18 anos */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Digite a idade do nadador");
        i = sc.nextInt();
        if (i >= 5 && i <= 7) {
            System.out.println("Categoria Infantil A");
        }
        if (i >= 8 && i <= 10) {
            System.out.println("Categoria Infantil B");
        }
        if (i >= 11 && i <= 13) {
            System.out.println("Categoria Juvenil A");
        }
        if (i >= 14 && i <= 17) {
            System.out.println("Categoria Juvenil B");
        }
        if (i >= 18) {
            System.out.println("Categoria Sênior");
        }
        sc.close();
    }
}