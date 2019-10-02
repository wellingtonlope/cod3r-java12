package classe;

public class Produto {
    String nome;
    Double preco;
    Double desconto;

    Double precoComDesconto() {
        return preco * (1 - desconto);
    }

    Double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
