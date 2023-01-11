/*9. Faca um programa que calcule a area de um triangulo, cuja base e altura sao fornecidas pelo usuario.
Esse programa nao pode permitir a entrada de dados invalidos, ou seja, medidas menores ou iguais a 0. */

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b, h, area;
        b = sc.nextFloat();
        h = sc.nextFloat();
        if (b > 0 && h > 0) {
            area = b * h;
            System.out.println("Área: " + area / 2);
        } else {
            System.out.println("Medidas inválidas");
        }
        sc.close();
    }
}
