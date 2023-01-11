/*3. Leia uma cadeia de caracteres no formato ”DD/MM/AAAA” e copie o dia, mes e ano para 3 variaveis
inteiras. Antes disso, verifique se as barras estao no lugar certo, e se DD, MM e AAAA sao numericos.*/

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = new char[10];
        String data;
        System.out.println("Informe a data no formato: DD/MM/AAAA ");
        data = sc.next();
        data.toCharArray();
        for (char charArray : data) {
        }

        int numeroConvertido = Integer.parseInt(charArray);
        System.out.println(numeroConvertido);

        sc.close();
    }
}
