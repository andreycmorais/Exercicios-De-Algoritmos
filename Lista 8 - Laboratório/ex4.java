/*4. Escreva uma funcao para determinar a quantidade de numeros primos abaixo N*/

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primo, n;
        System.out.println("Digite o valor de N");
        n = sc.nextInt();
        primo = qtdePrimos(n);
        System.out.println(primo);
        sc.close();
    }

    public static int qtdePrimos(int a) {
        int primos = 0;
        for (int i = 1; i < a; i++) {
            if (i % 1 == 0 && i % i == 0) {
                primos++;
            }
        }
        return primos;
    }
}