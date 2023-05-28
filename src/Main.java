import Animais.Cachorro;
import Animais.Gato;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1;
        cachorro1 = new Cachorro("dog", "caramelo", 25, 5.5, 5);

        Gato gato1 = new Gato("branco", "branco", 1, 4.75, 12);

        gato1.soar();

        System.out.println(gato1.getNome());

        System.out.println(cachorro1.getNome());
        cachorro1.soar("Miau Miau");
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("Pega a bolinha " + cachorro1.getNome());
        System.out.println("O " + cachorro1.getNome() + " " + cachorro1.interagir("pega"));

    }
}