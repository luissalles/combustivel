package br.gov.serpro.combustivel;

public class ConsultorPrecoCombustivelExcecao implements ConsultorPrecoCombustivel {
	
	ConsultorPrecoCombustivelExcecao(){
		throw new IntegracaoConsultaCombustivelIndisponivelException("999", "Integração consulta combustível indisponível");
	}
	
	public double obterPrecoCombustivel(String siglaCombustivel) {
		throw new IntegracaoConsultaCombustivelIndisponivelException("999", "Integração consulta combustível indisponível");
	}
}
