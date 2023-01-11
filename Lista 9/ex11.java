/*11. Faca um programa que receba do usuario uma string. O programa imprime a string sem suas vogais. */

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x, y;
        System.out.println("Digite uma palavra ou uma frase");
        x = sc.next();
        char[] vet = x.toCharArray();
        char[] vet2;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == "a" || vet[i] == "A" || vet[i] == "e" || vet[i] == "E" || vet[i] == "i" || vet[i] == "I"
                    || vet[i] == "o" || vet[i] == "O" || vet[i] == "u" || vet[i] == "U") {
                i++;
                continue;
            } else {
                vet2[i] = vet[i];
            }
        }
        vet[2] = vet.toString(y);
        sc.close();
    }
}
