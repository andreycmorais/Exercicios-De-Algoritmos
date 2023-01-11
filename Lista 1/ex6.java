/*6. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;
        System.out.println("Digite a temperatura em graus Fahrenheit");
        f = sc.nextDouble();
        c = (f - 32) / 1.8;
        System.out.println("A temperatura convertida em Celsius é: " + c);
        sc.close();
    }
}