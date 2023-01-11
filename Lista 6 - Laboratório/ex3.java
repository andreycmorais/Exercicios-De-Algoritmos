/*3. Escreva um programa que leia o numero de habitantes de uma determinada cidade, o valor do kwh,
e para cada habitante entre com os seguintes dados: consumo do mes e o codigo do consumidor (1-
Residencial, 2-Comercial, 3-Industrial). No final imprima o maior, o menor e a media do consumo dos
habitantes; e por fim o total do consumo de cada categoria de consumidor. */

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int habitantes, codigo, repete = 1, i;
        float maior = 0, menor = 0, media = 0;
        float residencial = 0, comercial = 0, industrial = 0, consumo;
        System.out.println("Informe o numero de habitantes: ");
        habitantes = sc.nextInt();
        for (i = 0; i < habitantes; i++) {
            System.out.println("Informe o consumo do cidadão  " + i + 1);
            consumo = sc.nextInt();
            if (i == 0) {
                maior = menor = consumo;
            }
            media += consumo;
            repete = 1;
            while (repete != 1) {
                repete = 0;
                System.out.println(
                        "Informe o codigo do consumidor: [1] Residencial / [2] Comercial / [3] Industrial");
                codigo = sc.nextInt();
                switch (codigo) {
                    case 1:
                        residencial += consumo;
                        break;
                    case 2:
                        comercial += consumo;
                        break;
                    case 3:
                        industrial += consumo;
                        break;
                    default:
                        System.out.println(" Erro ");
                        repete = 1;
                        break;
                }
            }
        }
        System.out.println(" Dados do Consumo ");
        System.out.println("Maior consumo:" + maior);
        System.out.println("Menor consumo: " + menor);
        System.out.println("Media de consumo: " + media / habitantes);
        System.out.println(" Total do Consumo ");
        System.out.println("Residencial: " + residencial);
        System.out.println("Comercial: " + comercial);
        System.out.println("Industrial: " + industrial);
        sc.close();
    }
}
