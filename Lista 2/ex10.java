/*10. Faca um programa que leia tres numeros inteiros positivos e efetue o calculo de uma das seguintes
medias de acordo com um valor numerico digitado pelo usuario:
(a) Geometrica: razi cúbica (x * y * z)
(b) Ponderada: (x+2 * y+3 * z) / 6
(c) Harmonica: 1 / (1/x + 1/y + 1/z)
(d) Aritmetica: (x+y+z) /3 */

import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, operacao;
        float x;
        System.out.println("Digite 3 números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        System.out.println(
                "Qual operação deseja fazer? Digite '1' para Geométrica, '2' para Ponderada, '3' para Harmônica e '4' para Aritmética");
        operacao = sc.nextInt();
        switch (operacao) {
            case 1:
                x = n1 * n2 * n3;
                System.out.println("Resultado: " + Math.cbrt(x));
                break;
            case 2:
                x = (n1 + 2 * n2 + 3 * n3) / 6;
                System.out.println("Resultado: " + x);
                break;
            case 3:
                x = 1 / n1 + 1 / n2 + 1 / n3;
                System.out.println("Resultado: " + 1 / x);
                break;
            case 4:
                x = (n1 + n2 + n3) / 3;
                System.out.println("Resultado: " + x);
                break;
        }
        sc.close();
    }
}
