package br.com.confidencecambio.javabasico.utils;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class VerificaNumerosUtilsTest {

    @Test
    @DisplayName("Deve retornar true se a String passada for numero")
    public void deveRetornarTrue() {

        boolean b = VerificaNumerosUtils.verificaCampos("52.2");
        assertTrue(b);
    }

    @Test
    @DisplayName("Deve retornar false se a String passada não for numero")
    public void deveRetornarFalse() {
        boolean b = VerificaNumerosUtils.verificaCampos("teste");
        assertFalse(b);
    }

}
