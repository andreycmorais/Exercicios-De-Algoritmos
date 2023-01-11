/*2. Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa devera calcular e mostrar:
• A menor altura do grupo;
• A maior altura do grupo; */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double menorAlt = 0, maiorAlt = 0, altura;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a altura");
            altura = sc.nextDouble();
            if (i == 0) {
                menorAlt = altura;
                maiorAlt = altura;
            }
            if (altura > maiorAlt) {
                maiorAlt = altura;
            } else if (altura < menorAlt) {
                menorAlt = altura;
            }
        }
        System.out.println("A maior altura do grupo é " + maiorAlt + ", e a menor altura é " + menorAlt);
        sc.close();
    }
}
