package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 =  2;
		
		boolean resultado = (valor1 == 1 ) && (valor2 ==2);
		System.out.println("Valor1 � 1 AND valor2 � 2 - Resultado: "+ resultado);
		
		boolean resultado1 = (valor1 == 1 ) || (valor2 ==2);
		System.out.println("Valor1 � 1 or valor2 � 2 - Resultado: "+ resultado);


	}

}
