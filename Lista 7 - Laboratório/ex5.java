/*5. Faca um programa que calcule a soma de todos os numeros primos abaixo de dois milhoes.*/

public class ex5 {
    public static void main(String[] args) {
        int i, j, somaPrim = 2, quantDiv = 0;
        for (i = 3; i <= 2000000; i += 2) {
            quantDiv = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    quantDiv++;
                }
            }
            if (quantDiv == 2) {
                somaPrim += i;
            }
        }
        System.out.printf("A soma dos numeros primos abaixo de 2 milhoes é: " + quantDiv);
    }
}
