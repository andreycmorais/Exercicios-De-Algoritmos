/*2. Faca um programa que calcule e mostre a area de um trapezio. Sabe-se que: A = (basemaior+basemenor)×2 / 2 .
Lembre-se que a base maior e a base menor devem ser numeros maiores que zero. */

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area, basemenor, basemaior;
        System.out.println("Digite a base maior e a base menor");
        basemaior = sc.nextFloat();
        basemenor = sc.nextFloat();
        if (basemaior > 0 && basemenor > 0) {
            area = ((basemaior + basemenor) * 2) / 2;
            System.out.println("A área é: " + area);
        } else {
            System.out.println("As bases devem sem maiores que 0.");
        }
        sc.close();
    }
}