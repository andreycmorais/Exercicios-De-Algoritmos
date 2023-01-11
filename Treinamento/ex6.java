import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 números - 0 ou 1");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("FALSO");

        } else if (a == 1 && b == 1) {
            System.out.println("VERDADEIRO");
        } else {
            System.out.println("NÚMEROS DIFERENTES");
        }
        sc.close();
    }

}
