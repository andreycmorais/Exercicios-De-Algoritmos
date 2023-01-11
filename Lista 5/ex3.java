/*3. Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equacao:
hipotenusa = raiz de (a2 + b2)*/

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o valor dos catetos do triângulo");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(calculaH(a, b));
        sc.close();
    }

    public static double calculaH(int a, int b) {
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hipotenusa;
    }
}