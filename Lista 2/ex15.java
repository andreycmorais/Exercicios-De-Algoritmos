/*15. Leia o salario de um trabalhador e o valor da prestacao de um emprestimo. Se a prestacao for maior que
20% do salario imprima: Emprestimo nao concedido, caso contrario imprima: Emprestimo concedido. */

import java.util.*;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float s, p;
        System.out
                .println("Digite o salário do trabalhador, e em seguida, o valor da prestação do empréstimo desejado.");
        s = sc.nextFloat();
        p = sc.nextFloat();
        if (p > ((s * 20) / 100)) {
            System.out.println("Empréstimo não concedido");
        } else {
            System.out.println("Empréstimo concedido");
        }
        sc.close();
    }
}