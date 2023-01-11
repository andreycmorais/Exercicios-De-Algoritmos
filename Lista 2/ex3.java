/*3. Faca um programa para verificar se um determinado numero inteiro e divisıvel por 3 ou 5, mas nao
simultaneamente pelos dois. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n % 3 != 0 && n % 5 == 0) {
            System.out.println("Número divisível por 5");
        } else if (n % 3 == 0 && n % 5 != 0) {
            System.out.println("Número divisível por 3");
        } else {
            System.out.println("Sem resposta");
        }
        sc.close();
    }
}