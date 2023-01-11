/*4. Faca um programa que leia um nome e imprima as 4 primeiras letras do nome. */

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        System.out.println("Digite um nome");
        nome = sc.next();
        String primeirasLetras;
        primeirasLetras = nome.substring(0, 4);
        System.out.println("As 4 primeiras letras do nome são: " + primeirasLetras);
        sc.close();
    }
}