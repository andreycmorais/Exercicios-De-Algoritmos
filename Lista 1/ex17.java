/*17. Faca um programa para ler as dimensoes de um terreno (comprimento c e largura l), bem como o preco
do metro de tela p. Imprima o custo para cercar este mesmo terreno com tela. */

import java.util.*;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comp, larg, preco, custo;
        System.out.println("Digite o comprimento do terreno, a largura, e o preço da tela por metro.");
        comp = sc.nextFloat();
        larg = sc.nextFloat();
        preco = sc.nextFloat();
        custo = (preco * comp * 2) + (preco * larg * 2);
        System.out.println("O custo total é de: " + custo);
        sc.close();
    }
}