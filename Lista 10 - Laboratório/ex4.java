/*4. Dados dois vetores x e y em um espaco de 10 dimensoes, determine o produto escalar desses vetores
usando um laco. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int[] produto = new int[10];
        int i;
        for (i = 0; i < produto.length; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            produto[i] = x[i] * y[i];
            System.out.println("Resultado: " + produto[i]);
        }
        sc.close();
    }
}