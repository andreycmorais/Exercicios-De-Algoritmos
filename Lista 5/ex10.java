/*10. Faca uma funcao que receba a distancia em Km e a quantidade de litros de gasolina consumidos por um
carro em um percurso, calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela
abaixo:
Consumo KM/L Mensagem
menor que 8 Venda o carro!
entre 8 e 14 Economico!
maior que 14 Super economico */

import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km, litros;
        System.out.println("Digite a quantidade de quilômetros e depois, quantos litros de gasolina foram gastos");
        km = sc.nextFloat();
        litros = sc.nextFloat();
        System.out.println(consumo(km, litros));
        sc.close();
    }

    public static float consumo(float km, float litros) {
        float kmL;
        kmL = km / litros;
        if (kmL < 8) {
            System.out.println("Venda o carro");
        } else if (kmL >= 8 && kmL <= 14) {
            System.out.println("Econômico");
        } else {
            System.out.println("Super econômico!");
        }
        return kmL;
    }
}