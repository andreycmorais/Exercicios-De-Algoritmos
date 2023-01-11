/*3. Leia um vetor de 10 posicoes e atribua valor 0 para todos os elementos que possuırem valores negativos */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero");
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                vet[i] = 0;
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
