package Exercicio5;

import java.util.Date;


public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = new Date();
        this.dataDevolucao = null;
        this.livro.setEmprestado(true);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void devolver() {
        this.livro.setEmprestado(false);
        this.dataDevolucao = new Date();
    }

    public boolean isDevolvido() {
        return dataDevolucao != null;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro.getTitulo() +
                ", pessoa=" + pessoa.getNome() +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}