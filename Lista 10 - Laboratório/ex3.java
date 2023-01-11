/*3. Faca um programa que leia 10 valores reais e os apresente na ordem inversa entrada. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        float[] vet = new float[10];
        for (i = 0; i < vet.length; i++) {
            vet[i] = sc.nextFloat();
        }
        for (i = 9; i >= 0; i--) {
            System.out.println(vet[i]);
        }
        sc.close();
    }
}