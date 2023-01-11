/*18. Faca um programa em que troque todas as ocorrencias de uma letra L1 pela letra L2 em uma string. A
string e as letras L1 e L2 devem ser fornecidas pelo usuario. */

import java.util.*;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        char l1, l2;
        System.out.println("Digite uma palavra: ");
        palavra = sc.next();
        char[] charArray = palavra.toCharArray();
        System.out.println("Substituir letra: ");
        l1 = sc.next().charAt(0);
        System.out.println(" Pela letra: ");
        l2 = sc.next().charAt(0);
        for (int i = 0; i < palavra.length(); i++) {
            if (charArray[i] == l1) {
                charArray[i] = l2;
            }
        }
        System.out.println(charArray);
        sc.close();
    }
}
