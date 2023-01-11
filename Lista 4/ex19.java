/*19. O funcionario chamado Carlos tem um colega chamado Joao que recebe um salario que equivale a um
terco do seu salario. Carlos gosta de fazer aplicacoes na caderneta de poupanca e vai aplicar seu salario
integralmente nela, pois esta rendendo 2% ao mes. Joao aplicar a seu salario integralmente no fundo
de renda fixa, que esta rendendo 5% ao mes. Construa um programa que devera calcular e mostrar
a quantidade de meses necessarios para que o valor pertencente a Joao iguale ou ultrapasse o valor
pertencente a Carlos. Teste com outros valores para as taxas. */

public class ex19 {
    public static void main(String[] args) {
        int qtdemeses = 0;
        float salarioJoao, salarioCarlos = 1000, rendaC, rendaJ;
        salarioJoao = salarioCarlos / 3;
        rendaC = salarioCarlos + ((salarioCarlos * 2) / 100);
        rendaJ = salarioJoao + ((salarioJoao * 5) / 100);
        while (rendaC > rendaJ) {
            rendaC = rendaC + ((rendaC * 2) / 100);
            rendaJ = rendaJ + ((rendaJ * 5) / 100);
            qtdemeses++;
        }
        System.out.println("Levará " + qtdemeses + " meses para João equiparar ao salário de Carlos.");
    }
}
