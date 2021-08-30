package Questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[5];
        Scanner myObj = new Scanner(System.in);

        String nome, cargo;
        int totalStarters = 0, totalJuniors = 0, totalSeniors = 0;

        for(int i = 0; i < pessoa.length; i++){
            System.out.print("Informe o nome da " + i + "°" + " pessoa: ");
            nome = myObj.nextLine();
            pessoa[i].setNome(nome);

            System.out.print("Informe o cargo da " + i + "°" + " pessoa (Starter, Junior ou Senior): ");
            cargo = myObj.nextLine();

            if(cargo == ""){
                pessoa[i].setCargo("Sênior");
            }else{
                pessoa[i].setCargo(cargo);
            }
        }

        for(int i = 0; i < pessoa.length; i++){
            if(pessoa[i].getCargo() == "starter"){
                totalStarters++;
            }
            else if(pessoa[i].getCargo() == "junior"){
                totalStarters++;
            }
            else{
                totalSeniors++;
            }
        }

        System.out.println("Total de pessoas");
        System.out.println("Starter: " + totalStarters);
        System.out.println("Junior: " + totalJuniors);
        System.out.println("Sênior: " + totalSeniors);
    }
}
