/*16. Leia uma cadeia de caracteres e converta todos os caracteres para maiuscula. Dica: subtraia 32 dos
caracteres cujo codigo ASCII esta entre 97 e 122*/

import java.util.*;

public class ex16 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String palavra;
      System.out.println("Digite uma palavra");
      palavra = sc.next();
      palavra.toLowerCase();
      System.out.println(palavra.toUpperCase());
      sc.close();
   }
}
