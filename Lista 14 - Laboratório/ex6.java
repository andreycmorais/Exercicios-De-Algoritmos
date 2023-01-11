/*Implemente um programa que leia duas strings, str1 e str2, e um valor inteiro positivo N. Concatene nao
mais que N caracteres da string str2 a string str1 e termine str1 com ”0”.*/

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String s1, s2;
        int num;
        System.out.println("Digite a primeira String: ");
        s1 = sc.next();
        System.out.println("Digite a segunda String: ");
        s2 = sc.next();
        System.out.println("Agora informe um número: ");
        num = sc.nextInt();
        System.out.println(s1 + " " + 0 + " " + s2 + " " + num);
    }
}
