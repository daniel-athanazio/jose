package Desafio;

public class Menu  {
    protected String Nome;
    protected String Cpf;

    public Menu(String nome, String CPF, String email, String telefone) {
        this.Nome = nome;
        this.Cpf = CPF;
        this.Email = email;
        this.Telefone = telefone;
    }

    protected String Email;
    protected String Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return Cpf;
    }

    public void setCPF(String CPF) {
        this.Cpf = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

}

