package Questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int multiplicando, inicio, fim;

        System.out.print("Multiplicando: ");
        multiplicando = Integer.parseInt(myObj.nextLine());
        if(multiplicando < 0 || multiplicando > 1500){
            System.out.println("Entrada inválida!");
          System.exit(0);
        }

        System.out.print("início do intervalo: ");
        inicio = Integer.parseInt(myObj.nextLine());
        if(inicio < 0 || inicio > 1500){
            System.out.println("Entrada inválida!");
            System.exit(0);
        }

        System.out.print("Fim do intervalo: ");
        fim = Integer.parseInt(myObj.nextLine());
        if(fim < 0 || fim > 1500){
            System.out.println("Entrada inválida!");
            System.exit(0);
        }

        if(inicio > fim || fim - inicio > 10){
            System.out.println("Entrada inválida!");
            System.exit(0);
        }

        System.out.println("Multiplicando: " + multiplicando);
        System.out.println("início do intervalo: " + inicio);
        System.out.println("Fim do intervalo: " + fim);

        for(int i = inicio; inicio <= fim; inicio++){
            System.out.println(multiplicando + " X " + inicio + " = " + multiplicando * inicio);
        }
    }
}
