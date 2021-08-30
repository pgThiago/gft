package Questao1;

public class Gato extends Animal{
    public Gato(String nome, Double peso) {
        super(nome, peso);
    }

    @Override
    public String som() {
        return "miau";
    }

    @Override
    public Double quantidadeDeRacao() {
        Double total = 0.0;
        if(super.peso <= 3){
            total = 10.0 * 3;
        }
        else{
            total = 13.0 * super.peso;
        }
        return total;
    }
}
