/*2. Escreva um programa que escreva na tela, de 1 ate 100, de 1 em 1, 3 vezes. A primeira vez deve usar a
estrutura de repeticao for, a segunda while, e a terceira do while. */

public class ex2 {
    public static void main(String[] args) {
        int n;
        for (n = 1; n <= 100; n++) {
            System.out.println(n);
        }
        while (n <= 100) {
            System.out.println(n);
            n++;
        }
        do {
            System.out.println(n);
            n++;
        } while (n <= 100);
    }
}
