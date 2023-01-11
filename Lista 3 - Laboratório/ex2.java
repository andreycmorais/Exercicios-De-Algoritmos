/*2. Ler um numero inteiro. Se o numero lido for negativo, escreva a mensagem "Numero invalido". Se o
numero for positivo, calcular o logaritmo deste numero. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();
        if (numero >= 0) {
            System.out.println(Math.log(numero));
        } else {
            System.out.println("Número inválido.");
        }
        sc.close();
    }
}
