package br.gov.serpro.combustivel;

public class ComparadorPrecoCombustivel {
	PrecoCombustivel precoCombustivel;
	
	public ComparadorPrecoCombustivel(PrecoCombustivel precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public String resultadoComparacao() {
		return "Comprar Etanol";
	}
}
