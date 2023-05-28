package Animais;

public class Cachorro {

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void soar() {
        System.out.println("Au au au");
    }

    public String pegarBolinha() {
        return "pegou a bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "pega":
                this.estadoDeEspirito = pegarBolinha();
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }

        return this.estadoDeEspirito;
    }
}
