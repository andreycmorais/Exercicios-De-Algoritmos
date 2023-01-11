import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite seu peso");
        peso = sc.nextDouble();
        System.out.println ("Digite sua altura");
        altura = sc.nextDouble();
        imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println ("Abaixo do peso");
        } else if (imc > 18.5 && imc < 25) {
            System.out.println ("Peso normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println ("Peso normal");
        }
        else if (imc > 30) {
            System.out.println ("Peso normal");
        }
        sc.close();
    }
}