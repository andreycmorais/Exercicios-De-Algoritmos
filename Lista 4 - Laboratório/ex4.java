/*4. Escrever um algoritmo que leia uma quantidade desconhecida de numeros e conte quantos deles estao
nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
for lido um numero negativo. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, int1 = 0, int2 = 0, int3 = 0, int4 = 0;
        System.out.println("Digite quantos números desejar");
        n = sc.nextInt();
        while (n >= 0) {
            n = sc.nextInt();
            if (n <= 25) {
                int1++;
            } else if (n >= 26 && n <= 50) {
                int2++;
            } else if (n >= 51 && n <= 75) {
                int3++;
            } else if (n >= 76 && n <= 100) {
                int4++;
            }
        }
        System.out.println("No intervalo 0-25 foram registrados " + int1 + " número (s).");
        System.out.println("No intervalo 26-50 foram registrados " + int2 + " número (s).");
        System.out.println("No intervalo 51-75 foram registrados " + int3 + " número (s).");
        System.out.println("No intervalo 76-100 foram registrados " + int4 + " número (s).");
        sc.close();
    }
}