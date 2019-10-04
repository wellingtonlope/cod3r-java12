package oo.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            this.velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (this.velocidadeAtual >= 5)
            this.velocidadeAtual -= 5;
        else
            this.velocidadeAtual = 0;
    }

    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h.";
    }
}
