/*19. O custo ao consumidor de um carro novo e a soma do custo de fabrica, da comissao do distribuidor, e
dos impostos. A comissao e os impostos sao calculados sobre o custo de fabrica, de acordo com a tabela
abaixo. Leia o custo de fabrica e escreva o custo ao consumidor.
Custo de Fabrica - % do distribuidor - % dos impostos
ate R$ 12.0000 - 5 - Isento
entre R$ 12.000 e 25.0000 - 10 - 15
acima de R$ 25.000 - 15 - 20 */

import java.util.*;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custoF, custoC;
        System.out.println("Qual o custo de fábrica do veículo?");
        custoF = sc.nextDouble();
        if (custoF < 12000) {
            custoC = custoF + (custoF * 0.05);
            System.out.println("O valor de venda para o consumidor é de " + custoC + " reais.");
        } else if (custoF >= 12000 && custoF <= 25000) {
            custoC = custoF + (custoF * 0.25);
            System.out.println("O valor de venda para o consumidor é de " + custoC + " reais.");
        } else {
            custoC = custoF + (custoF * 0.35);
            System.out.println("O valor de venda para o consumidor é de " + custoC + " reais.");
        }
        sc.close();
    }
}