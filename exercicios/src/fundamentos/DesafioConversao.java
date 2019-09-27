package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro salário: ");
        double salario1 = Double.parseDouble(entrada.nextLine().replace(",", "."));
        System.out.print("Informe o segundo salário: ");
        double salario2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
        System.out.print("Informe o terceiro salário: ");
        double salario3 = Double.parseDouble(entrada.nextLine().replace(",", "."));

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.printf("A média dos salários é R$%.2f\n", media);
    }
}
