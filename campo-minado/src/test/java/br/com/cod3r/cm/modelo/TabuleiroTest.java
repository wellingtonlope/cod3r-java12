package br.com.cod3r.cm.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabuleiroTest {
    private Tabuleiro tabuleiro;

    @BeforeEach
    void iniciarCampo() {
        tabuleiro = new Tabuleiro(2, 2, 1);
    }

    @Test
    void totalCampos() {
        assertEquals(4, tabuleiro.getCampos().size());
    }

    @Test
    void camposMinados() {
        int minados = (int) tabuleiro.getCampos().stream().filter(Campo::isMinado).count();

        assertEquals(1, minados);
    }

    @Test
    void objetivoNaoAlcancado() {
        assertFalse(tabuleiro.objetivoAlcancado());
    }

    @Test
    void objetivoAlcancado() {
        for (Campo campo : tabuleiro.getCampos()) {
            if (campo.isMinado()) {
                campo.alternarMarcacao();
            } else {
                campo.abrir();
            }
        }

        assertTrue(tabuleiro.objetivoAlcancado());
    }

    @Test
    void reiniciar() {
        for (Campo campo : tabuleiro.getCampos()) {
            if (campo.isMinado()) {
                campo.alternarMarcacao();
            } else {
                campo.abrir();
            }
        }

        tabuleiro.reiniciar();

        assertFalse(tabuleiro.objetivoAlcancado());
    }

}
