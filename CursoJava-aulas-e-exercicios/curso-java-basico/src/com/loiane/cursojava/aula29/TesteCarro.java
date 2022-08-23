package com.loiane.cursojava.aula29;



public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		/*
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		*/
		Carro van2 = new Carro("Ferrari", "caro", 10);
		
		
		
		System.out.println("Numero de passageiro é igual a " + van.numPassageiro);
		
		System.out.println("A marca do carro é " + van2.marca);
		System.out.println("O modelo do carro é " + van2.modelo);
		System.out.println("O numero de passageiros do carro é " + van2.numPassageiro);

	}

}
