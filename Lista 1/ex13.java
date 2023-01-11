/*13. Leia um numero inteiro de 4 dıgitos (de 1000 a 9999) e imprima 1 dıgito por linha. */

import java.util.*;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, unidade, dezena, centena, milhar;
        System.out.println("Digite um número entre 1000 e 9999");
        numero = sc.nextInt();
        milhar = numero / 1000;
        numero = numero % 1000;
        centena = numero / 100;
        numero = numero % 100;
        dezena = numero / 10;
        numero = numero % 10;
        unidade = numero;
        System.out.println(milhar);
        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);
        sc.close();
    }
}