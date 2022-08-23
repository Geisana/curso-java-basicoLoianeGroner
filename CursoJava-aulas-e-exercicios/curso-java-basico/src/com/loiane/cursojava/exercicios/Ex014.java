package com.loiane.cursojava.exercicios;

import java.util.Scanner ;
public class Ex014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Velocidade da conexão em Mbps: ");
		double velocidade = scan.nextDouble();
		
		double tempo = tamanhoArquivo / (velocidade);
		
		System.out.println("Tempo de download em minutos "+ tempo);

	}

}
