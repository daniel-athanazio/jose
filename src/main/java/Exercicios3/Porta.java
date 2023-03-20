package Exercicios3;

public class Porta {private boolean aberta;
    private String cor;

    public Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public void abre() {
        aberta = true;
    }

    public void fecha() {
        aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public String toString() {
        return "Porta: cor = " + cor + ", aberta = " + aberta;
    }
}


