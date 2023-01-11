/*4. Dados tres valores, A, B, C, verificar s eles podem ser valores dos lados de um triangulo e, se forem, se é
um triangulo escaleno, equilatero ou isosceles, considerando os seguintes conceitos:
• O comprimento de cada lado de um triangulo é menor do que a soma dos outros dois lados.
• Chama-se equilatero o triangulo que tem tres lados iguais.
• Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais.
• Recebe o nome de escaleno o triangulo que tem os tres lados diferentes. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite as medidas dos lados do triângulo");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Triângulo escaleno");
            } else {
                System.out.println("Triângulo isósceles");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
        sc.close();
    }
}