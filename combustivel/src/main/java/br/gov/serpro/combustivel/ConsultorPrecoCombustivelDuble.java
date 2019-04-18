package br.gov.serpro.combustivel;

public class ConsultorPrecoCombustivelDuble implements ConsultorPrecoCombustivel{
	double precoEtanol;
	double precoGasolina;
	
	ConsultorPrecoCombustivelDuble(double precoEtanol, double precoGasolina){
		this.precoEtanol = precoEtanol;
		this.precoGasolina = precoGasolina;
	}
	
	@Override
	public double obterPrecoCombustivel(String siglaCombustivel) {
		switch (siglaCombustivel) {
			case "Etanol":
				return this.precoEtanol;
			case "Gasolina":
				return this.precoGasolina;
			default:
				return this.precoEtanol;
		}
	}
}
