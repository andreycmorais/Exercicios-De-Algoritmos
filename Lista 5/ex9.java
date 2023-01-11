/*9. Faca uma funcao que receba dois valores numericos e um sımbolo. Este sımbolo representara a operacao
que se deseja efetuar com os numeros. Se o sımbolo for ’+’ devera ser realizada uma adicao, '-' se for uma
subtracao, se for ’/’ uma divisao e se for ’*’ sera efetuada uma multiplicacao. */

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        char simbolo;
        System.out.println("Digite 2 números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println(
                "Agora a operação que deseja: '+' para adição, '-' para subtração, '/' para divisão ou '*' para multiplicação");
        simbolo = sc.next().charAt(0);
        System.out.println("O resultado da operação é: " + calculadora(n1, n2, simbolo));
        sc.close();
    }

    public static float calculadora (int n1, int n2, float simbolo) {
        float resultado = 0;
        if (simbolo == '+') {
            resultado = n1 + n2;
        } else if (simbolo == '-') {
            resultado = n1 - n2;
        } else if (simbolo == '/') {
            resultado = n1 / n2;
        } else if (simbolo == '*') {
            resultado = n1 * n2;
        } else {
            System.out.println ("Operação inválida");
        }
        return resultado;
    }
}