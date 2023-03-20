package Exercicios;

import java.util.Scanner;

public class Exercicios2 {
    public static class Porta {
        private boolean aberta;
        private String cor;
        private double dimensaoX;
        private double dimensaoY;
        private double dimensaoZ;

        public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
            this.aberta = aberta;
            this.cor = cor;
            this.dimensaoX = dimensaoX;
            this.dimensaoY = dimensaoY;
            this.dimensaoZ = dimensaoZ;
        }

        public void abre() {
            this.aberta = true;
            System.out.println("A porta foi aberta.");
        }

        public void fecha() {
            this.aberta = false;
            System.out.println("A porta foi fechada.");
        }

        public void pinta(String cor) {
            this.cor = cor;
            System.out.println("A porta foi pintada de " + cor + ".");
        }

        public boolean estaAberta() {
            return this.aberta;
        }

        public void imprimeDados() {
            System.out.println("Porta - Dimensões: " + this.dimensaoX + " x " + this.dimensaoY + " x " + this.dimensaoZ);
            System.out.println("Cor: " + this.cor);
            System.out.println("Status: " + (this.aberta ? "aberta" : "fechada"));
        }


        public static void main(String[] args) {
            Porta porta = new Porta(false, "branca", 2.1, 0.9, 0.05);

            Scanner imput = new Scanner(System.in);

            while (true) {
                System.out.println("Digite a operação que deseja realizar na porta:");
                System.out.println("1 - Abrir");
                System.out.println("2 - Fechar");
                System.out.println("3 - Pintar");
                System.out.println("4 - Alterar dimensões");
                System.out.println("5 - Verificar status");
                System.out.println("6 - Imprimir dados");
                System.out.println("0 - Sair");

                int opcao = imput.nextInt();

                switch (opcao) {
                    case 1:
                        porta.abre();
                        break;
                    case 2:
                        porta.fecha();
                        break;
                    case 3:
                        System.out.println("Digite a cor desejada:");
                        String cor = imput.next();
                        porta.pinta(cor);
                        break;
                    case 4:
                        System.out.println("Digite as novas dimensões (X Y Z):");
                        double dimensaoX = imput.nextDouble();
                        double dimensaoY = imput.nextDouble();
                        double dimensaoZ = imput.nextDouble();
                        porta.dimensaoX = dimensaoX;
                        porta.dimensaoY = dimensaoY;
                        porta.dimensaoZ = dimensaoZ;
                        System.out.println("As dimensões foram alteradas.");
                        break;
                    case 5:
                        System.out.println("A porta está " + (porta.estaAberta() ? "aberta" : "fechada") + ".");
                        break;
                    case 6:
                        porta.imprimeDados();
                        break;
                    case 0:
                        System.out.println("Encerrando o programa.");
                        imput.close();
                        return;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

                System.out.println();

            }
        }
    }
}

