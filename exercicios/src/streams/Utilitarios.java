package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios() {
    }

    public final static UnaryOperator<String> maiuscula = item -> item.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = item -> item.charAt(0) + "";

    public final static String grito(String item) {
        return item + "!!! ";
    }
}
