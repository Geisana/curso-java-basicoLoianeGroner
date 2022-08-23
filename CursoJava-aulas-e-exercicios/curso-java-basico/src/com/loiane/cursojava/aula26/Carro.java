package com.loiane.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro �: "+capCombustivel * consumoCombustivel + "km");
	}
		
	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel (double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
	 
	
	
	}
