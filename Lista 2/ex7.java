/*7. Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado possui uma taxa
diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). Faca um programa em que o
usuario entre com o valor e o estado destino do produto e o programa retorne o preco final do produto
acrescido do imposto do estado em que ele sera vendido. Se o estado digitado nao for valido, mostrar
uma mensagem de erro. */

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor;
        String estado;
        System.out.println("Digite o valor do produto e o estado de destino: MG / SP / RJ / MS");
        valor = sc.nextFloat();
        estado = sc.next();
        if (estado.equals("MG")) {
            valor = valor + (valor * 7) / 100;
            System.out.println("Valor final: " + valor);
        } else if (estado.equals("SP")) {
            valor = valor + (valor * 12) / 100;
            System.out.println("Valor final: " + valor);
        } else if (estado.equals("RJ")) {
            valor = valor + (valor * 15) / 100;
            System.out.println("Valor final: " + valor);
        } else if (estado.equals("MS")) {
            valor = valor + (valor * 8) / 100;
            System.out.println("Valor final: " + valor);
        } else {
            System.out.println("Erro");
        }
        sc.close();
    }
}