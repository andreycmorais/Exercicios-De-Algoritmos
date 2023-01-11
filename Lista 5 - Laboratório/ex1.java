//Faca um algoritmo que encontre o primeiro ḿultiplo de 11, 13 ou 17 apos um numero dado

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, mult11 = 0, mult13 = 0, mult17 = 0;
        System.out.println("Digite um numero inteiro");
        num = sc.nextInt();
        while (mult11 == 0 || mult13 == 0 || mult17 == 0) {
            if (num % 11 == 0 && mult11 == 0) {
                mult11 = num;
            }
            if (num % 13 == 0 && mult13 == 0) {
                mult13 = num;
            }
            if (num % 17 == 0 && mult17 == 0) {
                mult17 = num;
            }
            num++;
        }
        System.out.println("O primeiro numero divisível por 11 depois do numero " + num + " é :" + mult11);
        System.out.println("O primeiro numero divisível por 13 depois do numero " + num + " é :" + mult13);
        System.out.println("O primeiro numero divisível por 17 depois do numero " + num + " é :" + mult17);
        sc.close();
    }
}
