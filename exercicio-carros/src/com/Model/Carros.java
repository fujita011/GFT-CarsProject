package com.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.Exceptions.ModeloExceptions;
import com.Exceptions.PorteException;
import com.Exceptions.anoFabricacaoException;
import com.Exceptions.anoModeloException;

public class Carros {

	private static final Integer anoAtual = 2019;
	private Integer anoFabricacaov;
	private String modelo;
	private String marca;
	private String porte;
	private String cor;
	private String placa;
	private Integer anoFabricacao;
	private Integer anoModelo;
	
 

	public Carros(String modelo, String marca, String porte) {
		if (!(marca.equals("Ferrari") || marca.equals("Fiat") || marca.equals("Renault"))) {
			throw new ModeloExceptions();
		}
		if (!(porte.equals("Sedan") || porte.equals("SUV") || porte.equals("Esportivo"))) {
			throw new PorteException();
		}
		this.modelo = modelo;
		this.marca = marca;
		this.porte = porte;
	}

	public Carros() {

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
//		Pattern regexPlaca = Pattern.compile("/[A-Z]{3}[0-9]{4}/");
//		Matcher m = regexPlaca.matcher(placa);
//	      if (m.find()) {
	    	  this.placa = placa;
//	         System.out.println("Placa: " + placa);
//	      }
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		if(!(anoFabricacao > anoAtual)) {
			this.anoFabricacao = anoFabricacao;
		}else {
			throw new anoFabricacaoException();
		}
		
	}
	
	public Integer getAnoAtual() {
		return anoAtual;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		anoFabricacaov = (anoFabricacao + 1);
		if(anoModelo.equals(anoFabricacao) || (anoModelo.equals(anoFabricacaov))) {
		this.anoModelo = anoModelo;
		}else {
			throw new anoModeloException();
		}
		
	}
	public String toString() {
		System.out.println("");
		return "Dados do Carro: " + this.modelo + " \n| Marca: " + this.marca + " \n| Cor: " + this.cor + " \n| Placa: "
				+ this.placa + " \n| Porte: " + this.porte + " \n| Ano Fabricação: " + this.anoFabricacao + " \n| Ano Modelo: " + this.anoModelo;
	}
	
	
	
	
	
	
	
	

}
