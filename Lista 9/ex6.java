/*6. Ler nome, sexo e idade. Se sexo for feminino e idade menor que 25, imprime o nome da pessoa e a
palavra "ACEITA", caso contrario imprimir "NÃO ACEITA". */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        String sexo = new String();
        int idade;
        System.out.println("Digite seu nome, em seguida seu sexo (M ou F), e por último a sua idade");
        nome = sc.next();
        sexo = sc.next();
        idade = sc.nextInt();
        if (sexo.equals("F") && idade < 25) {
            System.out.println(nome + " ACEITA");
        } else {
            System.out.println("NÃO ACEITA");
        }
        sc.close();
    }
}