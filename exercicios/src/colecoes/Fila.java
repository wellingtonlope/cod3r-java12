package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna erro caso não consigo adicionar
        fila.offer("Bia"); // retorna false caso não consiga adicionar
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // retorna nulll caso não tenha elemento na fila
        System.out.println(fila.peek());
        System.out.println(fila.element()); // retorna um erro caso não tenha elemento na fila
        System.out.println(fila.element());

        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll()); // retorna nulll caso não tenha elemento na fila
        System.out.println(fila.remove()); // retorna um erro caso não tenha elemento na fila
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.remove());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);
    }
}
