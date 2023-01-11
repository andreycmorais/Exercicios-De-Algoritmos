/*3. Dados n e dois numeros inteiros positivos, i e j, diferentes de 0, imprimir em ordem crescente os n
primeiros naturais que sao multiplos de i ou de j e ou de ambos. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, cont = 0, div, mult = 0;
        System.out.println("Quantos múltiplos você quer?");
        n = sc.nextInt();
        System.out.println("Agora digite os números");
        i = sc.nextInt();
        j = sc.nextInt();
        while (cont < n) {
            if (mult % i == 0 || mult % j == 0) {
                div = mult;
                System.out.println(div);
                cont++;
            }
            mult++;
        }
        sc.close();
    }
}