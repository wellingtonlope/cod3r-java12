package oo.heranca.encapsulamento.casaB;

import oo.heranca.encapsulamento.casaA.Ana;

public class Pedro extends Ana {


    void testeAcessos() {
        // System.out.println(segredo);
        // System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar); // somente via herança
        System.out.println(todosSabem);
    }
}
