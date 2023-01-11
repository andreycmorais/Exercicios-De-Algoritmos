/*2. Faca um programa que gere uma matriz transposta (Matriz transposta é toda matriz onde sao trocadas
as linhas pelas colunas, ou vice-versa). */

public class ex2 {
    public static void main(String args[]) {
        int[][] mat = new int[3][3];
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = k++;
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matriz transposta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + mat[j][i]);
            }
            System.out.println();
        }
    }
}
