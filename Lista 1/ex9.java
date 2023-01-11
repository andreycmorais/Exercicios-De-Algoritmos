/*9. Uma empresa contrata um encanador a R$ 30,00 por dia. Faca um programa que solicite o numero de
dias trabalhados pelo encanador e imprima a quantia lıquida que devera ser paga, sabendo-se que sao
descontados 8% para imposto de renda. */

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        double diaria = 30.0, total, liquido;
        System.out.println("Quantos dias o encanador trabalhou?");
        dias = sc.nextInt();
        total = diaria * dias;
        liquido = total - ((total * 8) / 100);
        System.out.println("O encanador vai receber o líquido de R$ " + liquido);
        sc.close();
    }
}