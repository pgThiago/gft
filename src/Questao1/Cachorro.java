package Questao1;

public class Cachorro extends Animal {

    public Cachorro(String nome, Double peso) {
        super(nome, peso);
    }

    @Override
    public String som() {
        return "auau";
    }

    @Override
    public Double quantidadeDeRacao() {
        Double total = 0.0;
        if(super.peso <= 4){
            total = 40.0 * 3;
        }
        else if (super.peso <= 12){
            total = 45.0 * super.peso;
        }
        else {
            total = 55.0 * super.peso;
        }
        return total;
    }
}
