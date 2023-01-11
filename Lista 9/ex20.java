/*20. Faca um programa que preencha uma matriz de string com os modelos de cinco carros (exemplos de
modelos: Fusca, Gol, Vectra, etc.). Em seguida, preencha um vetor com o consumo desses carros, isto e,
quantos quilometros cada um deles faz com um litro de combustıvel. Calcule e mostre:
• O modelo de carro mais economico; 
• Quantos litros de combustıvel cada um dos carros cadastrados consome para percorrer uma
distancia de 1.000 quilometros*/

public class ex20 {
    public static void main(String[] args) {
        String[] carros = { "fiesta", "chronos", "civic", "corolla", "lancer" };
        int[] consumo = { 9, 1, 8, 9, 10, 11 };
        int maisEconomico, posicaoMaisEconomico = 0;

        for (int i = 0; i < consumo.length; i++) {
            maisEconomico = consumo[0];
            if (consumo[i] < maisEconomico) {
                maisEconomico = consumo[i];
                posicaoMaisEconomico = i;
            }
        }
        System.out.println("O carro mais economico é: " + carros[posicaoMaisEconomico]);

        System.out.println("O modelo: " + carros[0]);
        System.out.println("consome em 1000Km " + consumo[0] * 1000);

        System.out.println("O modelo: " + carros[1]);
        System.out.println("consome em 1000Km " + consumo[1] * 1000);

        System.out.println("O modelo: " + carros[2]);
        System.out.println("consome em 1000Km " + consumo[2] * 1000);

        System.out.println("O modelo: " + carros[3]);
        System.out.println("consome em 1000Km " + consumo[3] * 1000);

    }
}
