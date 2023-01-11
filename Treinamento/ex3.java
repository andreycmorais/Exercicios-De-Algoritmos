/*3. FAÇA UM ALGORITMO PARA RECEBER UM NÚMERO QUALQUER E INFORMAR NA TELA SE É PAR OU ÍMPAR.*/

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite um número inteiro");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println ("O número digitado é par");
        } else if (a % 2 == 1) {
            System.out.println ("O número digitado é ímpar");
        } else {
            System.out.println ("Só é possível com números inteiros");
        }
        sc.close();
    }
}