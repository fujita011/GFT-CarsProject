package com.Main;

import java.util.ArrayList;

import com.Exceptions.ModeloExceptions;
import com.Exceptions.PorteException;
import com.Exceptions.anoFabricacaoException;
import com.Exceptions.anoModeloException;
import com.Model.Carros;

public class TesteCarros {

	public static void main(String[] args) {

		ArrayList<String> cor = new ArrayList<String>();
		cor.add("Preto");
		cor.add("Branco");
		cor.add("Amarelo");

		ArrayList<String> placa = new ArrayList<String>();

		placa.add("dad4424");
		placa.add("asd7030");
		placa.add("dad4175");
		
		ArrayList<Integer> anoFabricacao = new ArrayList<Integer>();

		anoFabricacao.add(2020);
		anoFabricacao.add(2014);
		anoFabricacao.add(2016);
		
		ArrayList<Integer> anoModelo = new ArrayList<Integer>();

		anoModelo.add(2020);
		anoModelo.add(2015);
		anoModelo.add(2016);

		System.out.println("                           Sistema de registro de veículos");
		System.out.println("                           -------------------------------");
		System.out.println("");
		try {
			Carros[] carro = new Carros[3];
			carro[0] = new Carros("Linea", "Fiat", "Sedan");
			carro[1] = new Carros("Califórnia", "Ferrari", "Esportivo");
			carro[2] = new Carros("Sandero", "Renault", "Sedan");

			for (int i = 0; i < carro.length; i++) {
				try {
				carro[i].setAnoFabricacao(anoFabricacao.get(i));
				carro[i].setPlaca(placa.get(i).trim().toUpperCase());
				carro[i].setCor(cor.get(i).trim());
				carro[i].setAnoModelo(anoModelo.get(i));
				System.out.println(carro[i].toString());
				} catch (anoFabricacaoException | anoModeloException e) {
					System.out.println(e.getMessage());
				}
			}
		}
				 catch (ModeloExceptions | PorteException e) {
					System.out.println(e.getMessage());
				}
		
		

	}

}
