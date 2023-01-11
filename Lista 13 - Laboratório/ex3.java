/*3. Faca uma funcao que recebe um valor inteiro e verifica se o valor é positivo ou negativo. A funcao deve
retornar um valor booleano. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println("O número digitado é positivo? " + VerificaN(n));
        sc.close();
    }

    public static boolean VerificaN(int n) {
        boolean positivo;
        if (n >= 0) {
            positivo = true;
        } else {
            positivo = false;
        }
        return positivo;
    }
}