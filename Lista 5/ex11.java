/*11. Crie um programa que receba tres valores (obrigatoriamente maiores que zero), representando as
medidas dos tres lados de um triangulo. Elabore funcoes para:
• Determinar se eles lados formam um triangulo, sabendo que:
O comprimento de cada lado de um triangulo e menor do que a soma dos outros dois lados.
1
• Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo. Sendo que:
Chama-se equilatero o triangulo que tem tres lados iguais.
Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais.
Recebe o nome de escaleno o triangulo que tem os tres lados diferentes. */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Digite as medidas do triângulo");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        System.out.println(triangulo(n1, n2, n3));
        sc.close();
    }

    public static String triangulo(int n1, int n2, int n3) {
        String tipoTriangulo;
        if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
            if (n1 == n2 && n2 == n3) {
                tipoTriangulo = "Triângulo equilátero";
            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                tipoTriangulo = "Triângulo isósceles";
            } else {
                tipoTriangulo = "Triângulo escaleno";
            }
        } else {
            tipoTriangulo = "Não forma um triângulo";
        }
        return tipoTriangulo;
    }
}