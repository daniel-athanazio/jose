package Classes;

public class TestaPessoas
{
    public static void main(String[] args) {

        Pessoas p1 = new Pessoas("Joao da silva");
        p1.setIdade (10);
        //FAZER ANIVERSARIO DO JOAO
        p1.fazaniversario();
        p1.fazaniversario();
        p1.fazaniversario();

        System.out.println("Nome da pessoa: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
    }



}
