/*15. Faca um algoritmo que converta uma velocidade expressa em km/h para m/s e vice versa. Voce deve
criar um menu com as duas opcoes de conversao e com uma opcao para finalizar o programa. O usuario
podera fazer quantas conversoes desejar, sendo que o programa so sera finalizado quando a opcao de
finalizar for escolhida. */

import java.util.*;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kmh, mts, opcao;
        System.out.println(
                "Digite '1' para converter de km/h para m/s, '2' de m/s para km/h ou qualquer outro número para finalizar.");
        opcao = sc.nextInt();
        if (opcao != 1 && opcao != 2) {
            System.out.println("Programa finalizado");
        } else {
            while (opcao == 1 || opcao == 2) {
                switch (opcao) {
                    case 1:
                        kmh = sc.nextInt();
                        System.out.println("Em m/s fica: " + kmh / 3.6);
                        break;
                    case 2:
                        mts = sc.nextInt();
                        System.out.println("Em km/h fica: " + mts * 3.6);
                        break;
                }
            }
        }
        sc.close();
    }
}