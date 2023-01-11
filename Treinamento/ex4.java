import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 números");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            c = a + b;
            System.out.println ("A soma dos números digitados é: " + c);
        } else if (a != b) {
            c = a * b;
            System.out.println ("A multiplicação dos números digitados é: " + c);
        } else {
            System.out.println("Só são válidos números inteiros");
        }
        sc.close();
    }
}