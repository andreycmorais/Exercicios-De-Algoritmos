/*20. Chico tem 1.50 metro e cresce 2 centımetros por ano, enquanto Ze tem 1.10 metros e cresce 3 centımetros
por ano. Escreva um programa que calcule e imprima quantos anos serao necessarios para que Ze seja
maior que Chico. */

public class ex20 {
    public static void main(String[] args) {
        int altChico = 150, altZe = 110, cZe, cChico, qtdeanos = 0;
        cChico = altChico + 2;
        cZe = altZe + 3;
        while (cZe <= cChico) {
            cZe = cZe + 3;
            cChico = cChico + 2;
            qtdeanos++;
        }
        System.out.println("Levará " + qtdeanos + " anos para Zé ser maior que Chico.");
    }
}
