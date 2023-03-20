package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {

            Scanner imput = new Scanner(System.in);

            ArrayList<String> nomes = new ArrayList<String>();

            System.out.println("Digite 50 nomes: ");
            for (int i = 0; i < 50; i++) {
                nomes.add(imput.nextLine());
            }

            Collections.sort(nomes);

            System.out.println("Nomes em ordem alfabética: ");
            for (String nome : nomes) {
                System.out.println(nome);
            }

            imput.close();
        }
    }

