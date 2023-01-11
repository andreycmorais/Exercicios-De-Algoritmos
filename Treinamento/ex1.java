import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a + b < c) {
            System.out.println("A soma dos dois primeiros números é menor que o segundo número.");
        } else {
            System.out.println("A soma dos dois primeiros números é maior que o segundo número.");
        }
        sc.close();
    }
}
