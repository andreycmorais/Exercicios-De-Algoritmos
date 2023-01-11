/*7. Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao é: R = G *
π/180, sendo G o angulo em graus e R em radianos e π = 3.14. */

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g, r;
        System.out.println("Digite um ângulo em graus");
        g = sc.nextDouble();
        r = g * 3.14 / 180;
        System.out.println("O ângulo em radianos é: " + r);
        sc.close();
    }
}