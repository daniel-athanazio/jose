package Exercicio5;

public class Livro {
  private String titulo;
  private String autor;

  private int anoPublicacao;

  private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

  public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public void setAutor (String autor){
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar(){
        this.emprestado = true;

    }

    public void  devolver(){
        this.emprestado = false;
    }


    public void setEmprestado(boolean b) {
    }
}



