package com.loiane.cursojava.exercicios;

import java.util.Scanner ;

public class Ex009_FareinheitParaCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o graus em Farenheit: ");
		double f = scan.nextDouble();
		double celsius = (5*(f-32)/9);
		
		System.out.println("O valor de "+f+" ºF em Celsius é "+celsius);

	}

}
