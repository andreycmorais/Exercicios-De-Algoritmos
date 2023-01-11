// Construa um programa que leia duas strings fornecidas pelo usu ́ario e verifique se a segunda string lida
// esta contida no final da primeira, retornando o resultado da verificac ̧ ̃ao.

import java.util.*;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.println("Digite a primeira String: ");
        a=sc.next();
        System.out.println("Digite a segunda String: ");
        b = sc.next();
        System.out.print(a.contains(b));    
        sc.close();
    }
}
