/*11. Leia uma matriz 4 x 4, imprima a matriz e retorne a localizacao (linha e a coluna) do maior valor */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int maior = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.println("Digite um numero");
                mat[i][j] = sc.nextInt();
                if (i == 0 && j == 0) {
                    maior = mat[i][j];
                }
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (maior == mat[i][j]) {
                    System.out.println("A linha é " + i + ", e a coluna é " + j);
                }
            }
        }
        sc.close();
    }
}
