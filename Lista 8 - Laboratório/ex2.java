/*2. Faca uma funcao que receba por parametro dois valores X e Z. Calcule e retorne o resultado de X*Z para
o programa principal. Atencao nao utilize nenhuma funcao pronta de exponenciacão*/

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, z, produto;
        x = sc.nextInt();
        z = sc.nextInt();
        produto = calculaProduto(x, z);
        System.out.println(produto);
        sc.close();
    }

    public static int calculaProduto(int x, int z) {
        int multiplicacao;
        multiplicacao = x * z;
        return multiplicacao;
    }
}