package Animais;

public class Gato extends Animal {

    private int tamanhoDoRabo;

    public Gato (String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
    }


    @Override
    public void soar() {
        System.out.println("miau miau");
    }
}
