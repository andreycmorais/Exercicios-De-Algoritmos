// Fac ̧a um programa para ler uma tabela contendo os nomes dos alunos de uma turma de 5 alunos. O
// programa deve solicitar ao usu ́ario os nomes do aluno, sempre perguntando se ele deseja inserir mais um
// nome na lista. Uma vez lidos todos os alunos, o usu ́ario ir ́a indicar um nome que ele deseja verificar se
// est ́a presente na lista, onde o programa deve procurar pelo nome (ou parte deste nome) e se encontrar
// deve exibir na tela o nome completo e o  ́ındice do vetor onde est ́a guardado este nome

import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char nome[5][30]; char aluno[30];
        int encontrou = 0;
    
        for (int i=0; i<5; i++) {
            System.out.printf("Entre com  o nome do %d aluno: ", i+1);
            fgets(nome[i], 30, stdin);
            nome[i][strlen(nome[i]) -1]  = '\0';
        }
    
        printf("Qual nome deseja encontrar? ");
        fgets(aluno, 30, stdin);
        aluno[strlen(aluno) -1]  = '\0';
    
    
        for (int i=0; i<5; i++) {
            if (strstr(nome[i], aluno)) {
                printf("\nNome Encontrado!\nIndice: %d\n Nome: %s", i, nome[i]);
                encontrou = 1;
            }
        }
    
        if (!encontrou) printf("Aluno nao encontrado.\n");
    

        sc.close();
    }
}
