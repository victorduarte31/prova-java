package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.utils.VerificaNumerosUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.Assert.assertEquals;

public class IMCServiceTest {

    private IMCService service;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void init(){
        service = new IMCService();
    }


    @Test
    public void retornarValorDoCalculoImc() {

        String peso = "80.0";
        String altura = "1.72";

        double aDouble = service.calculoImc(peso, altura);
        assertEquals(27.041644131963228, aDouble, 2);
    }

    @Test
    public void retornarExcecaoQuandoValoresInformadosForemNegativos() {

        thrown.expect(ResponseStatusException.class);
        thrown.expectMessage("Valores de peso ou altura não podem ser 0 ou negativos");

        String peso = "-80.0";
        String altura = "1.72";
        service.calculoImc(peso, altura);
    }

    @Test
    public void retornarExcecaoQuandoValoresInformadosForemInvalidos() {

        thrown.expect(ResponseStatusException.class);
        thrown.expectMessage("Valores de peso ou altura incorretos");

        String peso = "A80.0";
        String altura = "1.72";
        service.calculoImc(peso, altura);
    }
}
