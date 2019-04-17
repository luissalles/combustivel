package br.gov.serpro.combustivel;

public class ComparadorPrecoCombustivel {
	public static final String COMPRAR_ETANOL = "Comprar Etanol";
	
	PrecoCombustivel precoCombustivel;
	
	public ComparadorPrecoCombustivel(PrecoCombustivel precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public String resultadoComparacao() {
		return COMPRAR_ETANOL;
	}
}
