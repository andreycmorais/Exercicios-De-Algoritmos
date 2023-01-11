/*11. Faca um programa que calcula a associacao em paralelo de dois resistores R1 e R2 fornecidos pelo
usuario via teclado. O programa fica pedindo estes valores e calculando ate que o usuario entre com um
valor para resistencia igual a zero. R = R1∗R2 / R1+R2 */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2;
        float r = 1;
        while (r != 0) {
            r1 = sc.nextInt();
            r2 = sc.nextInt();
            r = (r1 * r2) / (r1 + r2);
        }
        System.out.println(r);
        sc.close();
    }
}