/*12. Leia a distancia em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso,
calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela abaixo:
Consumo Km/l - Mensagem
menor que 8 - Venda o carro!
entre 8 e 14 - Econômico!
maior que 12 - Super econômico! */

import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km, l, kmL;
        System.out
                .println("Digite a distância percorrida em KM, e em seguida, os litros de gasolina gastos no percurso");
        km = sc.nextFloat();
        l = sc.nextFloat();
        kmL = km / l;
        if (kmL < 8) {
            System.out.println("Venda o carro!");
        } else if (kmL > 8 && kmL < 14) {
            System.out.println("Econômico!");
        } else {
            System.out.println("Super econômico!");
        }
        sc.close();
    }
}