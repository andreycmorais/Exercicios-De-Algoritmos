/*7. Escreve um programa que verifique quais numeros entre 1000 e 9999 (inclusive) possuem a propriedade
seguinte: a soma dos dois dıgitos de mais baixa ordem com os dois dıgitos de mais alta ordem elevada
ao quadrado e igual ao proprio numero. Por exemplo, para o inteiro 3025, temos que:
30 + 25 = 55
552 = 3025 */

public class ex7 {
    public static void main(String[] args) {
        int x, y, z, n;
        for (n = 1000; n <= 9999; n++) {
            x = n / 100;
            y = n % 100;
            z = x + y;
            z = z * z;
            if (z == n) {
                System.out.println(z);
            }
        }
    }
}
