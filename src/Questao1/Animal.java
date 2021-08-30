package Questao1;

public abstract class Animal {
    protected String nome;
    protected Double peso;

    public Animal(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public abstract String som();
    public abstract Double quantidadeDeRacao();
}
