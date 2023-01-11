/*Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:
• A[i][j] = 2i + 7j - 2 se i ¡ j;
• A[i][j] = 3i2- 1 se i = j;
• A[i][j] = 4i3- 5j2+ 1 se i ¿ j. */

public class ex14 {
    public static void main(String[] args) {
        double[][] mat = new double[10][10];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i > j) {
                    mat[i][j] = (2 * i) + (7 * j) - 2;
                } else if (i == j) {
                    mat[i][j] = 3 * Math.pow(i, 2) - 1;
                } else if (i < j) {
                    mat[i][j] = (4 * Math.pow(i, 3) - (5 * Math.pow(j, 2)) + 1);
                }
                System.out.print(mat[i][j] + "/");
            }
        }
    }
}
