/*10. Faca um programa que receba uma palavra e a imprima de tras para frente. */

public class ex10 {
    public static void main(String[] args) {
        String x = "Ônibus";
        System.out.println(new StringBuilder(x).reverse().toString());
    }
}
