package br.gov.serpro.combustivel;

public class IntegracaoConsultaCombustivelIndisponivelException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	IntegracaoConsultaCombustivelIndisponivelException(String erro, String message){
		throw new ConsultaCombustivelIndisponivelException(erro, message);
	}
}
