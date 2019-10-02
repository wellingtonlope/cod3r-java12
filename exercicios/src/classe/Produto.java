package classe;

public class Produto {
    String nome;
    Double preco;
    static Double desconto = 0.25;

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    Double precoComDesconto() {
        return preco * (1 - desconto);
    }

    Double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
