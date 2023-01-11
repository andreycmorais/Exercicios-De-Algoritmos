/*Em matem ́atica, o n ́umero harmonico designado por H(n) define-se como sendo a soma da serie
harmonica:
H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
Faca um programa que leia um valor n inteiro e positivo e apresente o valor de H(n).*/

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n, h = 0, cont = 1;
        System.out.println("Digite um numero inteiro postivo");
        n = sc.nextFloat();
        while (cont <= n) {
            h += 1 / cont;
            cont++;
        }
        System.out.println("O valor de H(n):" + h);
        sc.close();
    }
}
