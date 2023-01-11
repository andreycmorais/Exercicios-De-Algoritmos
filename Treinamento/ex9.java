import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        char sexo;
        double altura, pesoIdeal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sexo - M / F");
        sexo = sc.nextLine().charAt(0);
        System.out.println("Digite sua altura");
        altura = sc.nextDouble();
        switch (sexo) {
            case 'M':
                pesoIdeal = (72.7 * altura) - 58;
                System.out.println("O seu peso ideal é: " + pesoIdeal);
                break;
            case 'F':
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("O seu peso ideal é: " + pesoIdeal);
                break;
        }
        sc.close();
    }
}