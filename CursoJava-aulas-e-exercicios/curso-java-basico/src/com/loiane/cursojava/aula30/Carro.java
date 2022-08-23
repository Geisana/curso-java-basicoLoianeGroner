package com.loiane.cursojava.aula30;

public class Carro {
	
	
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	

	public Carro() { }

	public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: "+capCombustivel * consumoCombustivel + "km");
	}
		
	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel (double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;

}}
