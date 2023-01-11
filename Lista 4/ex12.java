/*12. Faca um programa que leia um conjunto nao determinado de valores, um de cada vez, e escreva para
cada um dos valores lidos, o quadrado, o cubo e a raiz quadrada. Finalize a entrada de dados com um
valor negativo ou zero. */

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n > 0) {
            n = sc.nextInt();
            System.out.println("Quadrado: " + Math.pow(n, 2));
            System.out.println("Cubo: " + Math.pow(n, 3));
            System.out.println("Raiz quadrada: " + Math.sqrt(n));
        }
        sc.close();
    }
}