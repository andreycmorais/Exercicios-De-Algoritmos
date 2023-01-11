/*17. Leia um vetor contendo letras de uma frase inclusive os espacos em branco. Retirar os espaços em branco
do vetor e depois escrever o vetor resultante.*/

import java.util.*;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.printf("Informe uma frase");
        s = sc.nextLine();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (charArray[i] == ' ') {
                s.trim();
            }
        }
        System.out.println(s);
        sc.close();
    }
}
