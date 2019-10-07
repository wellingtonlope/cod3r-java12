package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println(c1.toString());

        c1.acelerar();
        System.out.println(c1.toString());

        c1.acelerar();
        System.out.println(c1.toString());

        Ferrari c2 = new Ferrari(400);
        c2.ligarTurbo();
        c2.ligarAr();
        c2.desligarAr();

        c2.acelerar();
        c2.frear();
        System.out.println(c2.toString());

        c2.acelerar();
        c2.frear();
        System.out.println(c2.toString());

        c2.acelerar();
        System.out.println(c2.toString());
    }
}
