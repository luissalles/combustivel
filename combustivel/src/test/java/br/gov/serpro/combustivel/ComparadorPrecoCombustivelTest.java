package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

public class ComparadorPrecoCombustivelTest {

	@Test
    public void retornaEtanolNaResposta() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(new PrecoCombustivel());
    	
    	Assert.assertEquals("Comprar Etanol", comparadorPrecoCombustivel.resultadoComparacao());
    }
}
