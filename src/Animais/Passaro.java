package Animais;

public class Passaro extends Animal{

    public Passaro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;

    }


    @Override
    public void soar() {
        System.out.println("piu piu");
    }
}
