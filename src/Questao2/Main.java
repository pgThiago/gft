package Questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        ArrayList<Integer> divisiveis = new ArrayList<Integer>();

        int numero;

        System.out.print("Digite um número: ");
        numero = Integer.parseInt(myObj.nextLine());

        if(numero % 3 == 0){
            divisiveis.add(3);
        }
        if(numero % 6 == 0){
            divisiveis.add(6);
        }
        if(numero % 7 == 0){
            divisiveis.add(7);
        }

        System.out.println("Divisível por: ");
        for(Integer divisivel: divisiveis){
            System.out.println(divisivel);
        }
    }
}
