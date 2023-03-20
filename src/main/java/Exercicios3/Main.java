package Exercicios3;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    Porta[] portas = new Porta[3];
    portas[0] = new Porta(false, "marrom");
    portas[1] = new Porta(false, "branca");
    portas[2] = new Porta(true, "verde");
    Casa casa = new Casa("azul", portas);


    System.out.println(casa);


    System.out.print("Digite a cor para pintar a casa: ");
    String novaCor = imput.nextLine();
    casa.pinta(novaCor);
    System.out.println(casa);

    System.out.print("Digite o número da porta que deseja abrir (1, 2 ou 3): ");
    int numPorta = imput.nextInt();
    if (numPorta >= 1 && numPorta <= 3) {
        portas[numPorta-1].abre();
    } else {
        System.out.println("Número inválido de porta!");
    }
    imput.nextLine();
    System.out.println(casa);

    System.out.print("Digite o número da porta que deseja fechar (1, 2 ou 3): ");
    numPorta = imput.nextInt();
    if (numPorta >= 1 && numPorta <= 3) {
        portas[numPorta-1].fecha();
    } else {
        System.out.println("Número inválido de porta!");
    }
    imput.nextLine();
    System.out.println(casa);


    System.out.println("Número de portas estão abertas: " + casa.quantasPortasEstaoAbertas());

    imput.close();
}}

