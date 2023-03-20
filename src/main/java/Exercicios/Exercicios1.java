package Exercicios;

public class Exercicios1 { private int idade;
    private    String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Exercicios1(String nomedapessoa){
        this.nome = nomedapessoa;
    }
    public void fazaniversario () {
        int novaidade =  this.idade  + 1;
        this.idade = novaidade;
    }
}


