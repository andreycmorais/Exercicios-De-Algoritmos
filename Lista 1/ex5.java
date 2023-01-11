/*5. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.println("Digite a temperatura em graus Celsius");
        c = sc.nextDouble();
        f = c * (9.0 / 5.0) + 32.0;
        System.out.println("A temperatura convertida em Fahrenheit é: " + f);
        sc.close();
    }
}
