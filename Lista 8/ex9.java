/*9. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao
final a matriz obtida. */

public class ex9 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i] == mat[j]) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j]);
            }
        }
    }
}
