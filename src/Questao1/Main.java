package Questao1;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Daphne", 20.0);
        Gato gato2 = new Gato("Artemis", 3.0);
        Gato gato3 = new Gato("Victor Hugo", 5.0);

        Cachorro cachorro1 = new Cachorro("Xereta", 10.0);

        Double totalRacao = gato1.quantidadeDeRacao() + gato2.quantidadeDeRacao() + gato3.quantidadeDeRacao() + cachorro1.quantidadeDeRacao();
        System.out.println("Total: " + totalRacao + "g");
    }
}
