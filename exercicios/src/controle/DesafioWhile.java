package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double total = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.print("Informe a nota (ou -1 p/ sair): ");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1){
                System.out.println("Nota inválida!");
            }
        }
        double media = total / quantidadeDeNotas;
        System.out.printf("Média: %.2f\n", media);
    }
}
