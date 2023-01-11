/*11. Receba o salario-base de um funcionario. Calcule e imprima o salario a receber, sabendo-se que esse
funcionario tem uma gratificacao de 5% sobre o salario-base. Alem disso, ele paga 7% de imposto sobre
o salario-base. */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioBase, salarioTotal;
        System.out.println("Digite o salário base do funcionário");
        salarioBase = sc.nextDouble();
        salarioTotal = salarioBase - ((salarioBase * 2) / 100);
        System.out.println("O funcionário vai receber R$ " + salarioTotal);
        sc.close();
    }
}