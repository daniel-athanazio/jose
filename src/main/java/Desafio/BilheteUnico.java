package Desafio;


import java.util.Random;

    public abstract class BilheteUnico{

        public Menu usuario;
        private String codigo;

        public Menu getUsuario() {
            return usuario;
        }
        public String getCodigo() {
            return codigo;
        }
        public BilheteUnico(Menu usuario) {
            this.usuario = usuario;
            codigo = geracodigo();
        }
        double saldo = 10;
        public void pagarPassagem(double desconto){

        }
        public void pagarPassagem(){

        }
        public String geracodigo(){
            double bilhete;
            Random random = new Random();
            bilhete = (int)(random.nextDouble() * 1000);

            return String.valueOf(bilhete);
        }

        public void recargaBilhete(){

        }

        public String toString(){
            String dados = "";

            dados += "Nome de Usuário: " + usuario.getNome() + " | ";
            dados += "Código do Bilhete: " + codigo + " | ";
            dados += "Número do Cpf: " + usuario.getCPF() + " | ";
            dados += "Número de Telefone: " + usuario.getTelefone() + " | ";
            dados += "Seu E-mail: " + usuario.getEmail() + " | ";
            dados += "Seu saldo Total: " + this.saldo + " | ";


            return dados;
        }

        public void recargaBilhete(double adicao){

        }
    }

