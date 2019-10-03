package classe.desafio;

public class Pessoa {
    String nome;
    Double peso;

    Pessoa() {

    }

    Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null)
            this.peso += comida.peso;
    }

    String apresentar() {
        return String.format("Olá eu sou o %s e tenho %.3fKgs.", nome, peso);
    }
}
