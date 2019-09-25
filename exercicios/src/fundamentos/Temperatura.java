package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        final double AJUSTE = 32;
        final double FATOR = 5 / 9.0; // divisão de inteiros retorna um inteiro

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");
    }
}
