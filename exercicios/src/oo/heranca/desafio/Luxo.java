package oo.heranca.desafio;

public interface Luxo {
    public abstract void ligarAr();
    void desligarAr();
    default int velocidadeDoAr() {
        return 1;
    }
}
