package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas: ");
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.printf("Informe a nota %d: ", (i + 1));
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / quantidadeNotas;
        System.out.printf("A média é %.2f", media);
    }
}
