package br.gov.serpro.combustivel;

public class ConsultaCombustivelIndisponivelException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String erro;
	
	ConsultaCombustivelIndisponivelException(String erro, String message){
		super(message);
		this.erro = erro;
	}
}
