import java.util.*;

public class ex8 {
    public static void main (String [] args) {
        int a, b, c;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite 3 números inteiros");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println ("Os números em ordem decrescente são: " + a + " " + b + " "+ c);
        } else if (a > b && c > b) {
            System.out.println ("Os números em ordem decrescente são: " + a + " " + c + " " + b);
        }
        else if (b > a && a > c) {
            System.out.println ("Os números em ordem decrescente são: " + b + " " + a + " " + c);
        }
        else if (b > c && c > a) {
            System.out.println ("Os números em ordem decrescente são: " + b + " " + c + " " + a);
        }
        else if (c > a && a > b) {
            System.out.println ("Os números em ordem decrescente são: " + c + " " + a + " " + b);
        }
        else if (c > b && b > a) {
            System.out.println ("Os números em ordem decrescente são: " + c + " " + b + " " + a);
        }
        sc.close();
    }
}
