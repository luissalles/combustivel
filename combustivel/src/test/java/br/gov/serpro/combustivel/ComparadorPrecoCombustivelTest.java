package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

import static br.gov.serpro.combustivel.ComparadorPrecoCombustivel.COMPRAR_ETANOL;
import static br.gov.serpro.combustivel.ComparadorPrecoCombustivel.COMPRAR_GASOLINA;

public class ComparadorPrecoCombustivelTest {

	@Test
    public void etanolComoMelhorEscolha() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(new PrecoCombustivel());
    	
    	Assert.assertEquals(COMPRAR_ETANOL, comparadorPrecoCombustivel.resultadoComparacao());
    }

	@Test
    public void gasolinaComoMelhorEscolha() {
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(new PrecoCombustivel());
    	
    	Assert.assertEquals(COMPRAR_GASOLINA, comparadorPrecoCombustivel.resultadoComparacao());
    }
}
