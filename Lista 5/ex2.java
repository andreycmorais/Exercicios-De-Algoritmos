/*2. Faca uma funcao que receba uma temperatura em graus Celsius e retorne-a convertida em graus
Fahrenheit. A formula de conversao e: F = C * (9.0/5.0) + 32.0, sendo F a temperatura em Fahrenheit e
C a temperatura em Celsius. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.println("Digite a temperatura em graus Celsius");
        c = sc.nextDouble();
        System.out.println(calculaF(c));
        sc.close();
    }

    public static double calculaF(double c) {
        double f;
        f = c * (9.0 / 5.0) + 32.0;
        return f;
    }
}