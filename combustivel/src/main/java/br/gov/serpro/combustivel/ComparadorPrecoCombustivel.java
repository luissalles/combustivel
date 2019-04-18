package br.gov.serpro.combustivel;

public class ComparadorPrecoCombustivel {
	public static final String COMPRAR_ETANOL = "Comprar Etanol";
	public static final String COMPRAR_GASOLINA = "Comprar Gasolina";
	
	ConsultorPrecoCombustivel precoCombustivel;
	
	public ComparadorPrecoCombustivel(ConsultorPrecoCombustivel precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public String resultadoComparacao() {
		double precoEtanol = precoCombustivel.obterPrecoCombustivel("Etanol");
		double precoGasolina = precoCombustivel.obterPrecoCombustivel("Gasolina");
		if((precoEtanol / precoGasolina) <= 0.7) {
			return COMPRAR_ETANOL;
		}else {
			return COMPRAR_GASOLINA;
		}
	}
}
