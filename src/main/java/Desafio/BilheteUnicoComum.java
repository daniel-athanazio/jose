package Desafio;
import java.util.Scanner;

public class BilheteUnicoComum extends BilheteUnico {

    public BilheteUnicoComum(Menu usuario) {
        super(usuario);
    }

    @Override
    public void pagarPassagem(double desconto) {
        saldo = saldo - desconto;
    }

    @Override
    public void recargaBilhete(double adicao) {
        saldo = saldo + adicao;
    }
}
