/*3. Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das componentes
deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem 10 elementos cada. Imprimir
todos os conjuntos. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vet1 = new double[10];
        double[] vet2 = new double[10];
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = sc.nextDouble();
            vet2[i] = Math.pow(vet1[i], 2);
        }
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i]);
            System.out.println(" Quadrado do número: " + vet2[i]);
        }
        sc.close();
    }
}
