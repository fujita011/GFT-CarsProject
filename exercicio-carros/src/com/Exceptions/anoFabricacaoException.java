package com.Exceptions;

import com.Model.Carros;

public class anoFabricacaoException extends RuntimeException{
	static Carros ano= new Carros();
	public anoFabricacaoException() {
		
		super("Ano de fabrica��o inv�lido. Deve ser menor ou igual � \"" + ano.getAnoAtual() + "\"");
	}

}
