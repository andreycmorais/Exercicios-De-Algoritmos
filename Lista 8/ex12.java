/*12. Leia uma matriz 5 x 5. Leia tambem um valor X. O programa devera fazer uma busca desse valor na
matriz e, ao final, escrever a localizacao (linha e coluna) ou uma mensagem de ”nao encontrado”. */

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int x;
        boolean naoachado = true;
        int[][] mat = new int[5][5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = rd.nextInt(100);
            }
        }
        System.out.println("Qual valor está procurando?");
        x = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (x == mat[i][j]) {
                    System.out.println("O numero está na localidade [" + i + "][" + j + "]");
                    naoachado = false;
                }
            }
        }
        if (naoachado) {
            System.out.println("Não encontrado");
        }
        sc.close();
    }
}
