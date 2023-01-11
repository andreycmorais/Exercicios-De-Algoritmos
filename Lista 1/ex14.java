/*14. Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos. */

import java.util.*;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos, horas, minutos;
        System.out.println("Digite os segundos que deseja converter");
        segundos = sc.nextInt();
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.println("São " + horas + " horas, " + minutos + " minutos, e " + segundos + " segundos.");
        sc.close();
    }
}
