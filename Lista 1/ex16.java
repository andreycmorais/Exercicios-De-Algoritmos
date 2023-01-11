/*16. Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido proporcionalmente ao
valor que cada deu para a realizacao da aposta. Faca um programa que leia quanto cada apostador
investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido. */

/*16. Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido proporcionalmente ao
valor que cada deu para a realizacao da aposta. Faca um programa que leia quanto cada apostador
investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido. */

import java.util.*;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amigo1, amigo2, amigo3, valorPremio, soma, premio1, premio2, premio3, aposta1, aposta2, aposta3;
        System.out.println("Digite o valor investido por cada amigo e o valor total do prêmio");
        amigo1 = sc.nextFloat();
        amigo2 = sc.nextFloat();
        amigo3 = sc.nextFloat();
        valorPremio = sc.nextFloat();
        soma = amigo1 + amigo2 + amigo3;
        aposta1 = (amigo1 * 100) / soma;
        aposta2 = (amigo2 * 100) / soma;
        aposta3 = (amigo3 * 100) / soma;
        premio1 = (aposta1 * valorPremio) / 100;
        premio2 = (aposta2 * valorPremio) / 100;
        premio3 = (aposta3 * valorPremio) / 100;
        System.out.println("O primeiro levará: " + premio1 + " , o segundo: " + premio2 + " e o terceiro: " + premio3);
        sc.close();
    }
}