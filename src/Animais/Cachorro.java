package Animais;

public class Cachorro extends Animal {


    private int tamanhoDoRabo;


    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
    }


    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public void soar(String miauMiau) {
        System.out.println("Au au au");
    }

    @Override
    public void soar() {
        System.out.println("Au au au");
    }

    public String pegarBolinha() {
        return "pegou a bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho" -> this.estadoDeEspirito = "feliz";
            case "pega" -> this.estadoDeEspirito = pegarBolinha();
            default -> this.estadoDeEspirito = "neutro";
        }

        return this.estadoDeEspirito;
    }
}
