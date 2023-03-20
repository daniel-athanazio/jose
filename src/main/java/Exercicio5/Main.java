package Exercicio5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos
        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro livro2 = new Livro("A Menina que Roubava Livros", "Markus Zusak", 2005);
        Pessoa pessoa1 = new Pessoa("João", "Rua A, 123", "99999-1234");
        Pessoa pessoa2 = new Pessoa("Maria", "Rua B, 456", "99999-5678");

        // Criação da lista de empréstimos
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        // Menu de opções
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n===== MENU DE OPÇÕES =====");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Emprestar livro
                    System.out.println("\n===== EMPRESTAR LIVRO =====");
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = scanner.next();
                    Livro livro = null;
                    if (nomeLivro.equals(livro1.getTitulo())) {
                        livro = livro1;
                    } else if (nomeLivro.equals(livro2.getTitulo())) {
                        livro = livro2;
                    } else {
                        System.out.println("Livro não encontrado!");
                        break;
                    }
                    if (livro.isEmprestado()) {
                        System.out.println("Livro já está emprestado!");
                    } else {
                        System.out.print("Digite o nome da pessoa: ");
                        String nomePessoa = scanner.next();
                        Pessoa pessoa = null;
                        if (nomePessoa.equals(pessoa1.getNome())) {
                            pessoa = pessoa1;
                        } else if (nomePessoa.equals(pessoa2.getNome())) {
                            pessoa = pessoa2;
                        } else {
                            System.out.println("Pessoa não encontrada!");
                            break;
                        }
                        Emprestimo emprestimo = new Emprestimo(livro, pessoa);
                        livro.setEmprestado(true);
                        emprestimos.add(emprestimo);
                        System.out.println("Empréstimo realizado com sucesso!");
                    }
                    break;
                case 2:
                    // Devolver livro
                    System.out.println("\n===== DEVOLVER LIVRO =====");
                    System.out.print("Digite o nome do livro: ");
                    nomeLivro = scanner.next();
                    livro = null;
                    for (Emprestimo emprestimo : emprestimos) {
                        if (emprestimo.getLivro().getTitulo().equals(nomeLivro)) {
                            livro = emprestimo.getLivro();
                            emprestimo.devolver();
                            break;
                        }
                    }
                    if (livro == null) {
                        System.out.println("Livro não encontrado!");
                    } else {
                        System.out.println("Devolução realizada com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
