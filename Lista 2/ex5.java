/*5. Leia a idade e o tempo de servico de um trabalhador e escreva se ele pode ou nao se aposentar. As
condicoes para aposentadoria sao:
• Ter pelo menos 65 anos;
• Ou ter trabalhado pelo menos 30 anos;
• Ou ter pelo menos 60 anos e trabalhando pelo menos 25 anos; */

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, tempo;
        System.out.println("Digite a idade do trabalhador, e em seguida o tempo de serviço do mesmo");
        idade = sc.nextInt();
        tempo = sc.nextInt();
        if (idade > 65 || tempo > 30 || idade >= 60 && tempo >= 25) {
            System.out.println("Aposenta");
        } else {
            System.out.println("Não aposenta ainda");
        }
        sc.close();
    }
}