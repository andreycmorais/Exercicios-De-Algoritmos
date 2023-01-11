/*5. Faca um programa que some os numeros impares contidos em um intervalo definido pelo usuario. O
usuario define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos
os numeros ımpares contidos neste intervalo. Caso o usuario digite um intervalo invalido (comecando
por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo de
valores invalido” e o programa termina. Exemplo de tela de saıda: Digite o valor inicial e valor final: 5
10
Soma dos ımpares neste intervalo: 21 */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i, soma = 0;
        System.out.println("Digite o valor inicial, em seguida digite o valor final");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n2 < n1 || n1 == n2) {
            System.out.println("Intervalo de valores inválido.");
        } else {
            for (i = n1; i <= n2; i++) {
                if (i % 2 == 1) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
