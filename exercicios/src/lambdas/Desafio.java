package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (isento)
         * 3. Frete: >= 3000 (100)/ < 3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         */

        // Minha implementação
        Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> imposto = valor -> {
            if (valor >= 2500)
                return valor * (1 + 0.085);
            return valor;
        };
        UnaryOperator<Double> precoFrete = valor -> {
            if (valor >= 3000)
                return valor + 100;
            return valor + 50;
        };
        UnaryOperator<Double> arredondamento = valor -> {
            String aux = String.format("%.2f", valor).replace(",", ".");
            return Double.parseDouble(aux);
        };
        Function<Double, String> paraReal = valor -> String.format("R$%.2f", valor).replace(".", ",");
        String resultado = precoReal
            .andThen(imposto)
            .andThen(precoFrete)
            .andThen(arredondamento)
            .andThen(paraReal)
            .apply(p);
        System.out.println(resultado);

        // Leonardo
        Function<Produto, Double> precoFinal =
            produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
            preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
            preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
            preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
        Function<Double, String> formatar =
            preco -> String.format("R$%.2f", preco).replace(".", ",");

        String preco = precoFinal
            .andThen(impostoMunicipal)
            .andThen(frete)
            .andThen(arredondar)
            .andThen(formatar)
            .apply(p);
        System.out.println("O preço final é " + preco);
    }
}
