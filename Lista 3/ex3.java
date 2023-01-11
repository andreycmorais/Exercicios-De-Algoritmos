/*3. Faca um algoritmo utilizando o comando while que mostra uma contagem regressiva na tela, iniciando
em 10 e terminando em 0. Mostrar uma mensagem “FIM!” apos a contagem. */

public class ex3 {
    public static void main(String[] args) {
        int n = 10;
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("FIM!");
    }
}