/*20. Ler uma sequencia de numeros inteiros e determinar se eles sao pares ou nao. Dever a ser informado o
numero de dados lidos e numero de valores pares. O processo termina quando for digitado o numero
1000. */

import java.util.*;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, qtdepares = 0, vezes = 0;
        while (n != 1000) {
            n = sc.nextInt();
            vezes++;
            if (n % 2 == 0) {
                qtdepares++;
            }
        }
        System.out.println("Números lidos: " + vezes + ", e pares: " + qtdepares);
        sc.close();
    }
}