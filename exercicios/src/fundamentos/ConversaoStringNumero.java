package fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;

        System.out.printf("Soma é %.1f\n", soma);
        System.out.printf("Média é %.1f\n", soma / 2);

        // Obter valores precisos
        BigDecimal p1 = BigDecimal.valueOf(7.9);
        BigDecimal p2 = BigDecimal.valueOf(8.3);
        System.out.println(p1.add(p2));

    }
}
