package com.loiane.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 100;
		van.capCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
	}

}
