package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

import static br.gov.serpro.combustivel.ComparadorPrecoCombustivel.COMPRAR_ETANOL;

public class ComparadorPrecoCombustivelTest {

	@Test
    public void etanolComoMelhorEscolha() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(new PrecoCombustivel());
    	
    	Assert.assertEquals(COMPRAR_ETANOL, comparadorPrecoCombustivel.resultadoComparacao());
    }
}
