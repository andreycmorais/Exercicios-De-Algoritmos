import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        int a, total;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite um número inteiro");
        a = sc.nextInt();
        if (a % 2 == 0) {
            total = a + 5;
            System.out.println ("O resultado do número digitado + 5 é: " + total);
        } else if (a % 2 == 1) {
            total = a + 8;
            System.out.println ("O resultado do número digitado + 8 é: " + total);
        }
        sc.close();
    }
}
