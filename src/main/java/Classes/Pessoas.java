package Classes;

public class Pessoas {
   private int idade;
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
    public Pessoas(String nomedapessoa){
        this.nome = nomedapessoa;
    }
    public void fazaniversario () {
        int novaidade =  this.idade  + 1;
        this.idade = novaidade;
    }
}
