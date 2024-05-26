package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Coleta o RA do aluno
        System.out.print("Digite o RA do Aluno: ");
        String aluno = entrada.nextLine();

        // Coleta o número de livros a serem emprestados
        System.out.print("Digite o número de Livros a ser Emprestado: ");
        int num = entrada.nextInt();

        int[] codigos = new int[num];

        // Coleta os códigos dos livros a serem emprestados
        for (int i = 0; i < num; i++) {
            System.out.print("Digite o código do livro " + (i + 1) + ": ");
            codigos[i] = entrada.nextInt();
        }

        // Cria uma instância de Controle para gerenciar o empréstimo
        Controle controle = new Controle();

        // Realiza o empréstimo de acordo com as informações coletadas
        boolean emprestimoRealizado = controle.emprestar(aluno, codigos, num);

        // Exibe uma mensagem indicando se o empréstimo foi realizado com sucesso
        if (emprestimoRealizado) {
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Falha ao realizar o empréstimo.");
        }
    }
}