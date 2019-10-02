package classe;

public class Produto {
    String nome;
    Double preco;
    Double desconto;

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Double precoComDesconto() {
        return preco * (1 - desconto);
    }

    Double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
