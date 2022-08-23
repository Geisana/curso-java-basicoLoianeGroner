package com.loiane.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro () {
		System.out.println("A classe carro foi instanciada.");
		numPassageiro = 4;
	}
	
	Carro(String marca_ , String modelo_ , int numPassageiros_) {
		marca = marca_;
		modelo = modelo_ ;
		numPassageiro = numPassageiros_;
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
