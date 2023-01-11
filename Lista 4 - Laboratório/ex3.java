/*3. Desenvolver um algoritmo que leia um numero nao determinado de valores e calcule e escreva a media
aritmetica dos valores lidos, a quantidade de valores positivos, a quantidade de valores negativos e o
percentual de valores negativos e positivos. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 0, qtdePos = 0, qtdeNeg = 0, soma = 0;
        float media, percPos, percNeg;
        System.out.println("Digite quantos números desejar");
        n = sc.nextInt();
        while (n != 0) {
            n = sc.nextInt();
            if (n > 0) {
                qtdePos++;
            } else if (n < 0) {
                qtdeNeg++;
            }
            soma += n;
            i++;
        }
        media = soma / i;
        percPos = i / qtdePos;
        percNeg = i / qtdeNeg;
        System.out.println("A média dos números lidos é " + media);
        System.out.println("A quantidade de números positivos lidos é " + qtdePos + ", o que dá " + percPos + "%");
        System.out.println("A quantidade de números negativos lidos é " + qtdeNeg + ", o que dá " + percNeg + "%");
        sc.close();
    }
}