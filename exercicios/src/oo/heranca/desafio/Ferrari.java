package oo.heranca.desafio;

public class Ferrari extends Carro{

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        this.delta = 15;
    }
}
