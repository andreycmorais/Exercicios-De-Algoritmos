/*19. Escreva um programa que leia a idade e o primeiro nome de 10 pessoas. Seu programa deve terminar
quando uma idade negativa for digitada. Ao terminar, seu programa deve escrever o nome e a idade das
pessoas mais jovens e mais velhas.*/

import java.util.*;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[10];
        int[] vet = new int[10];
        int menor = 9999, maior = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Idade: ");
            vet[i] = sc.nextInt();
            System.out.println("Digite o nome: ");
            nome[i] = sc.next();
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (menor < vet[i]) {
                menor = vet[i];
            }
            System.out.println("A maior idade digitada foi " + maior + " do " + nome);
            System.out.println("A menor idade digitada foi " + menor + " do " + nome);
        }

        sc.close();
    }
}
