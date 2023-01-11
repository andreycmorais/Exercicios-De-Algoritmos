/*7. Faca um programa que receba do usuario dois vetores, A e B, com 10 numeros inteiros cada. Crie um
novo vetor denominado C calculando C = A - B. Mostre na tela os dados do vetor C. */
import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite 10 valores para o vetor A, e depois 10 valores para o vetor B");
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = A[i] - B[i];
            System.out.println(C[i]);
        }
        sc.close();
    }
}
