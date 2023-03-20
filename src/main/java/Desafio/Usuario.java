package Desafio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            int conta;
            double adicionar;

            do {
                System.out.println("----Menu----");
                System.out.println("Informe uma opção ou use '99' para sair.");
                System.out.println("1 para Cadastrar novo Usuário.");
                System.out.println("2 para Cadastrar Bilhete.");
                System.out.println("3 para Recarregar Bilhete.");
                System.out.println("4 para Pagar Passagem.");
                System.out.println("5 para Listar Bilhetes.");
                System.out.println("6 para Pesquisar Bilhete por CPF.");
                System.out.println("Informe o valor: ");
                conta = input.nextInt();

                switch (conta) {
                    case 1:
                        CadastrarUsuario();
                        break;

                    case 2:
                        System.out.println("--Cadastrar Bilhete--");
                        CadastrarBilhete();
                        break;
                    case 3:
                        System.out.println("--Recarregar Bilhete--");
                        input.nextLine(); // Limpa o buffer do Scanner
                        System.out.println("Informe o codigo de seu bilhete");
                        String codigoBilhete = input.nextLine();
                        BilheteUnico salvar = null; // Variável para armazenar o bilhete encontrado
                        for (BilheteUnico bilhete : bilhetes) {
                            if (codigoBilhete.equals(bilhete.getCodigo())) {
                                salvar = bilhete;
                                break; // Encerra o loop assim que encontrar um bilhete correspondente
                            }
                        }
                        if (salvar == null) { // Verifica se um bilhete foi encontrado
                            System.out.println("Bilhete não encontrado.");
                        } else if (salvar instanceof BilheteUnicoEstudante){
                            salvar.recargaBilhete();
                            System.out.println("Ação concluída com perfeição.");
                        } else {
                            System.out.println("Informe o valor da recarga");
                             adicionar = input.nextInt();
                            salvar.recargaBilhete(adicionar);
                        }
                        break;

                    case 4:
                        System.out.println("--Pagar Passagem--");
                        input.nextLine(); // Limpa o buffer do Scanner
                        System.out.println("Informe o codigo de seu bilhete");
                        String codigoBilhete2 = input.nextLine();
                        salvar = null; // Reinicia a variável salvar
                        for (BilheteUnico bilhete : bilhetes) {
                            if (codigoBilhete2.equals(bilhete.getCodigo())) {
                                salvar = bilhete;
                                break; // Encerra o loop assim que encontrar um bilhete correspondente
                            }
                        }
                        if (salvar == null) { // Verifica se um bilhete foi encontrado
                            System.out.println("Bilhete não encontrado.");
                        } else if (salvar instanceof BilheteUnicoEstudante){
                            salvar.pagarPassagem();
                            System.out.println("Ação concluída com perfeição.");
                        } else {
                            double desconto = 5;
                            salvar.pagarPassagem(desconto);
                        }
                        break;

                    case 5:
                        listar();
                        break;
                    case 6:
                        System.out.println("--pesquisa--");
                        String nada2 = input.nextLine();
                        System.out.println("Digite o Cpf para ser pesquisado: ");
                        String salvarCpf = input.nextLine();
                        for (BilheteUnico bilhete : bilhetes) {
                            if (salvarCpf.equals(bilhete.getUsuario().getCPF())) {
                                salvar = bilhete;
                                System.out.println("O Bilhete e: " + bilhete);
                            }else {
                                System.out.println("CPF não localizado");
                            }
                        }
                        break;
                    case 24:
                        System.out.println("Esse é o número favorito do Erick Felipe  ASS:Daniel Athanazio");

                    default:
                        if (conta != 99){
                            System.out.println("--Valor invalido, digite um  valor valido--");
                            break;
                        }else {
                            System.out.println("--programa fechando--");
                        }

                }

            } while (conta != 99);

            input.close();

        }catch (InputMismatchException e){
            System.out.println("Valor inválido.");
            System.out.println("Reinicie para funcionar.");
        }

    }


    static BilheteUnico salvar;
    static ArrayList<Menu> usuarios = new ArrayList<Menu>();
    static ArrayList<BilheteUnico> bilhetes = new ArrayList<BilheteUnico>();
    private static void CadastrarUsuario(){

        Scanner input = new Scanner(System.in);
        System.out.println("--Cadastro de novo Usuário ---");
        System.out.println("digite o nome: ");
        String guardaNome = input.nextLine();
        System.out.println("digite o CPF: ");
        String guardaCPF = input.nextLine();
        System.out.println("digite o e-mail: ");
        String guardaEmail = input.nextLine();
        System.out.println("digite o telefone: ");
        String guardaTelefone = input.nextLine();

        Menu usuario = new Menu(guardaNome, guardaCPF, guardaEmail, guardaTelefone);
        usuarios.add(usuario);
    }

    private static void  CadastrarBilhete(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu CPF: ");
        String cpfBilhete = input.nextLine();
        Menu guardaUsuario = new Menu(" "," "," "," ");

        for (Menu usuario:usuarios) {
            if (cpfBilhete.equals(usuario.getCPF())){
                guardaUsuario = usuario;
                System.out.println("Qual o Bilhete: ");
                System.out.println("1 para o Bilhete unico");
                System.out.println("2 para o bilhete estudante");
                int escolha = input.nextInt();

                BilheteUnico bilhete;

                if (escolha == 1){
                    bilhete = new BilheteUnicoComum(guardaUsuario);
                    bilhetes.add(bilhete);
                }else {
                    bilhete = new BilheteUnicoEstudante(guardaUsuario);
                    bilhetes.add(bilhete);
                }
                System.out.println("Ação concluida");
            }else {
                System.out.println("CPF não encontrada");
            }
        }

    }
    private static void listar() {
        System.out.println("\n---Lista de Bilhetes---");
        if (bilhetes.isEmpty()) {
            System.out.println("Não há bilhetes cadastrados.");
        } else {
            for (BilheteUnico bilhete : bilhetes) {
                System.out.println(bilhete.toString());
            }
        }
    }

}