package br.com.cod3r.cm.modelo;

import br.com.cod3r.cm.exececao.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampoTest {
    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoDistancia1Esquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Direita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1EmCima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Embaixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia2() {
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeNaoVizinhoDistancia() {
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado() {
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao() {
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado() {
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado() {
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado() {
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoNaoMarcado() {
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }

    @Test
    void testeAbrirComVizinhos1() {
        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    void testeAbrirComVizinhos2() {
        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isFechado());
    }

    @Test
    void testeConstrutor() {
        Campo campo1 = new Campo(1, 2);
        boolean linhaCerta = campo1.getLinha() == 1;
        boolean colunaCerta = campo1.getColuna() == 2;
        assertTrue(linhaCerta && colunaCerta);
    }

    @Test
    void testeObjetivoAlcancadoDesvendado() {
        campo.abrir();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeObjetivoAlcancadoProtegido() {
        campo.minar();
        campo.alternarMarcacao();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testeMinasNaVizinhanca() {
        Campo campo22 = new Campo(2, 2);
        campo22.minar();
        Campo campo44 = new Campo(4, 4);

        campo.adicionarVizinho(campo22);
        campo.adicionarVizinho(campo44);

        assertEquals(1L, campo.minasNaVizinhanca());
    }

    @Test
    void testeReiniciar() {
        campo.minar();
        campo.alternarMarcacao();

        campo.reiniciar();

        boolean fechado = campo.isFechado();
        boolean naoMinado = !campo.isMinado();
        boolean naoMarcado = !campo.isMarcado();

        assertTrue(fechado && naoMinado && naoMarcado);
    }

    @Test
    void testeToStringMarcado() {
        campo.alternarMarcacao();
        assertEquals("x", campo.toString());
    }

    @Test
    void testeToStringMinado() {
        campo.abrir();
        campo.minar();
        assertEquals("*", campo.toString());
    }

    @Test
    void testeToStringMinasNaVizinhanca() {
        Campo campo22 = new Campo(2,2);
        campo22.minar();

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertEquals("1", campo.toString());
    }

    @Test
    void testeToStringAberto() {
        campo.abrir();

        assertEquals(" ", campo.toString());
    }

    @Test
    void testeToStringFechado() {
        assertEquals("?", campo.toString());
    }

}
