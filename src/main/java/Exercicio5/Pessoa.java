package Exercicio5;
import java.util.ArrayList;

public class Pessoa {
        private String nome;
        private String endereco;
        private String telefone;
        private ArrayList<Emprestimo> historicoEmprestimos;

        public Pessoa(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.historicoEmprestimos = new ArrayList<Emprestimo>();
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public ArrayList<Emprestimo> getHistoricoEmprestimos() {
            return historicoEmprestimos;
        }

        public void setHistoricoEmprestimos(ArrayList<Emprestimo> historicoEmprestimos) {
            this.historicoEmprestimos = historicoEmprestimos;
        }

        public void addEmprestimo(Emprestimo emprestimo) {
            historicoEmprestimos.add(emprestimo);
        }

        public void devolverLivro(Emprestimo emprestimo) {
            emprestimo.devolver();
        }
    }

