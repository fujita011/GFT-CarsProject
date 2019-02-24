package com.Exceptions;

import com.Model.Carros;

public class anoFabricacaoException extends RuntimeException{
	static Carros ano= new Carros();
	public anoFabricacaoException() {
		
		super("Ano de fabricação inválido. Deve ser menor ou igual à \"" + ano.getAnoAtual() + "\"");
	}

}
