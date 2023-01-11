/*5. Digite um nome, calcule e retorne quantas letras tem esse nome. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        System.out.println("Digite um nome");
        nome = sc.next();
        int c = nome.length();
        System.out.println("O nome escrito tem " + c + " letras.");
        sc.close();
    }
}