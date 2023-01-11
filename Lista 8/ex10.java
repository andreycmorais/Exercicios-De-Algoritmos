/*10. Faca um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da coluna de cada
elemento. Em seguida, imprima na tela a matriz. */

public class ex10 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = i * j;
                System.out.print(mat[i][j]);
            }
        }
    }
}
