/*3. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da diagonal
principal. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um numero");
                matriz[i][j] = sc.nextInt();
                if (i > j) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println(("A soma dos elementos abaixo da diagonal principal é: " + soma));
        sc.close();
    }
}
