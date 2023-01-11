import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        int a, dobro, triplo;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Digite um número inteiro maior ou menor que 0");
        a = sc.nextInt();
        if (a > 0) {
            dobro = a * 2;
            System.out.println ("O dobro do número digitado é: " + dobro);
        } else if (a < 0) {
            triplo = a * 3;
            System.out.println ("O triplo do número digitado é: " + triplo);
        }
        sc.close();
    }
}