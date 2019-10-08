package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);

        // UnaryOperator<String> maiuscula = item -> item.toUpperCase();
        UnaryOperator<String> primeiraLetra = item -> item.charAt(0) + "";
        // UnaryOperator<String> grito = item -> item + "!!! ";

        // Em um unico item
        // System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

        System.out.println("\n\nUsando composição...");
        marcas.stream()
            .map(Utilitarios.maiuscula)
            .map(primeiraLetra)
            .map(Utilitarios::grito)
            .forEach(print);
    }
}
