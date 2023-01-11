/*19. Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que ele recebeu um
aumento de 25%. */

import java.util.*;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor, aumento;
        System.out.println("Digite o salário do funcionário");
        valor = sc.nextFloat();
        aumento = valor + (valor * 25) / 100;
        System.out.println("O novo salário com aumento é de " + aumento + " reais.");
        sc.close();
    }
}