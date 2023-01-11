/*6. Determine se um determinado ano lido e bissexto. Sendo que um ano é bissexto se for divisıvel por 400
ou se for divisıvel por 4 e nao for divisıvel por 100. Por exemplo: 1988, 1992, 1996. */

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
        sc.close();
    }
}