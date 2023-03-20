package Exercicios3;

public class Casa {
    private String cor;
    private Porta[] portas;

    public Casa(String cor, Porta[] portas) {
        this.cor = cor;
        this.portas = portas;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas() {
        int count = 0;
        for (Porta porta : portas) {
            if (porta.estaAberta()) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Casa: cor = " + cor);
        for (int i = 0; i < portas.length; i++) {
            sb.append(", porta" + (i+1) + " = " + portas[i]);
        }
        return sb.toString();
    }
}

