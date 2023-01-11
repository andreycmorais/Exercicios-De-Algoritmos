/*3. Entre com um nome e imprima o nome somente se a primeira letra do nome for "a" (maiuscula ou
minuscula). */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        System.out.println("Digite um nome");
        nome = sc.next();
        if (nome.startsWith("A") || nome.startsWith("a")) {
            System.out.print("O nome digitado é: " + nome);
        }
        sc.close();
    }
}
