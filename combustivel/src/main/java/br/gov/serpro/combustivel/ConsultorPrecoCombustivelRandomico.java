package br.gov.serpro.combustivel;

import java.util.Random;

public class ConsultorPrecoCombustivelRandomico implements ConsultorPrecoCombustivel{

	@Override
	public double obterPrecoCombustivel(String siglaCombustivel) {
		Random randomNumber = new Random();
		
	    randomNumber = new Random();
	    return 10 * randomNumber.nextDouble();
	}
}
