/*1. Faca uma funcao que receba 3 numeros inteiros como parametro, representando horas, minutos e
segundos, e os converta em segundos. */

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.println("Digite as horas, os minutos e os segundos");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        System.out.println(calculaSegundos(horas, minutos, segundos));
        sc.close();
    }

    public static int calculaSegundos(int horas, int minutos, int segundos) {
        int segundosTotais;
        horas = horas * 3600;
        minutos = minutos * 60;
        segundosTotais = horas + minutos + segundos;
        return segundosTotais;
    }
}