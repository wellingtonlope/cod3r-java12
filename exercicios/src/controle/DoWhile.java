package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // if (...) sentenca; ou {}
        // while (...) setenca; ou {}
        // for (...;...;...) setenca; ou {}

        // do setenca; ou {} while(...);

        Scanner entrada = new Scanner(System.in);

        String texto = "por favor";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
