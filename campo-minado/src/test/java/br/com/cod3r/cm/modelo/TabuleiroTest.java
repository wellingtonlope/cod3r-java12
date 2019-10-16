package br.com.cod3r.cm.modelo;

import br.com.cod3r.cm.exececao.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

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

    @Test
    void abrirNaoMinado() {
        Optional<Campo> campo = tabuleiro.getCampos().stream()
            .filter(c -> !c.isMinado())
            .findFirst();

        if (campo.isPresent()) {
            Campo c = campo.get();
            tabuleiro.abrir(c.getLinha(), c.getColuna());

            assertTrue(c.isAberto());
        } else {
            throw new NullPointerException();
        }
    }

    @Test
    void abrirMinado() {
        Optional<Campo> campo = tabuleiro.getCampos().stream()
            .filter(Campo::isMinado)
            .findFirst();

        if (campo.isPresent()) {
            Campo c = campo.get();
            assertThrows(ExplosaoException.class, () -> {
                tabuleiro.abrir(c.getLinha(), c.getColuna());
            });
        } else {
            throw new NullPointerException();
        }
    }

    @Test
    void alternarMarcacao() {
        Campo campo = tabuleiro.getCampos().get(0);
        tabuleiro.alternarMarcacao(campo.getLinha(), campo.getColuna());

        assertTrue(campo.isMarcado());
    }

    @Test
    void testeToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" x  ? \n");
        sb.append(" ?  ? \n");
        Tabuleiro tabuleiro1 = new Tabuleiro(2, 2, 1);
        tabuleiro1.getCampos().get(0).alternarMarcacao();

        assertEquals(sb.toString(), tabuleiro1.toString());
    }

}
