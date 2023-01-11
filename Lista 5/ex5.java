/*5. Faca uma funcao que receba a altura e o raio de um cilindro circular e retorne o volume do cilindro. O
volume de um cilindro circular e calculado por meio da seguinte formula: V = π × raio2 × altura. */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura, raio;
        System.out.println("Digite e altura e o raio do cilindro");
        altura = sc.nextFloat();
        raio = sc.nextFloat();
        System.out.println(calculaVolume(altura, raio));
        sc.close();
    }

    public static double calculaVolume(float altura, float raio) {
        double volume;
        volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }
}