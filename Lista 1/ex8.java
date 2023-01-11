/*8. A importancia de R$ 780.000,00 sera dividida entre tres ganhadores de um concurso. Sendo que da
quantia total: O primeiro ganhador recebera 46%; O segundo recebera 32%; O terceiro recebera o
restante; Calcule e imprima a quantia ganha por cada um dos ganhadores. */

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 780.000, p1, p2, p3;
        p1 = (total * 46) / 100;
        p2 = (total * 32) / 100;
        p3 = (total - p1 - p2);
        System.out.println("O prêmio para o primeiro ganhador será de: " + p1 + " mil reais, o segundo ficará com " + p2
                + " mil reais, e o terceiro com " + p3 + " mil reais.");
        sc.close();
    }
}