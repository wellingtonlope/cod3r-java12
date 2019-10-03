package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Lasanha", 0.223);
        Comida c2 = new Comida("Pizza", 0.5);
        Pessoa p = new Pessoa("José", 99.5);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());
    }
}
