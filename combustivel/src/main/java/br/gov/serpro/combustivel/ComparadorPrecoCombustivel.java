package br.gov.serpro.combustivel;

public class ComparadorPrecoCombustivel {
	public static final String COMPRAR_ETANOL = "Comprar Etanol";
	public static final String COMPRAR_GASOLINA = "Comprar Gasolina";
	
	PrecoCombustivel precoCombustivel;
	
	public ComparadorPrecoCombustivel(PrecoCombustivel precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public String resultadoComparacao() {
		return COMPRAR_ETANOL;
	}
}
