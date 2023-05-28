import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1;
        cachorro1 = new Cachorro("dog", "caramelo", 25, 5.5, 5);

        System.out.println(cachorro1.getNome());
        cachorro1.latir();
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("Pega a bolinha " + cachorro1.getNome());
        System.out.println("O " + cachorro1.getNome() + " " + cachorro1.interagir("pega"));

    }
}