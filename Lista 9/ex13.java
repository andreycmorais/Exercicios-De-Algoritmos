/*13. Ler uma frase e contar quantos caracteres sao espaços em brancos. Lembre-se que uma frase é um
conjunto de caracteres (vetor). */

import java.util.*;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, ct = 0;
        String s;
        System.out.printf("Informe uma frase");
        s = sc.nextLine();
        int n = s.length();
        for (i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                ct = ct + 1;
            }
        }
        System.out.printf("Existem " + ct + " espacos em branco na frase.");
        sc.close();
    }

}
