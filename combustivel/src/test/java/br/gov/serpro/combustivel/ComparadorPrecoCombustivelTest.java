package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

import static br.gov.serpro.combustivel.ComparadorPrecoCombustivel.COMPRAR_ETANOL;
import static br.gov.serpro.combustivel.ComparadorPrecoCombustivel.COMPRAR_GASOLINA;

public class ComparadorPrecoCombustivelTest {
	ConsultorPrecoCombustivelDuble precoCombustivel;

	@Test
    public void etanolComoMelhorEscolha() {
		precoCombustivel = new ConsultorPrecoCombustivelDuble(6.99, 10.00);
		ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(precoCombustivel);
    	
    	Assert.assertEquals(COMPRAR_ETANOL, comparadorPrecoCombustivel.resultadoComparacao());
    }

	@Test
    public void gasolinaComoMelhorEscolha() {
		precoCombustivel = new ConsultorPrecoCombustivelDuble(7.01, 10.00);
    	ComparadorPrecoCombustivel comparadorPrecoCombustivel = new ComparadorPrecoCombustivel(precoCombustivel);
    	
    	Assert.assertEquals(COMPRAR_GASOLINA, comparadorPrecoCombustivel.resultadoComparacao());
    }
}
