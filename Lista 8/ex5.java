/*5. Faca um vetor de tamanho 50 preenchido com o seguinte valor: (i + 5 ×i)%(i + 1), sendo i a posicao
do elemento no vetor. Em seguida imprima o vetor na tela. */

public class ex5 {
    public static void main(String[] args) {
        int[] vet = new int[50];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (i + 5 * i) % (i + 1);
            System.out.print(vet[i] + "/");
        }
    }
}
