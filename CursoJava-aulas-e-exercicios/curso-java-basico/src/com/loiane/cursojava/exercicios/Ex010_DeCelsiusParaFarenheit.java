package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex010_DeCelsiusParaFarenheit {

	public static void main(String[] args) {
		System.out.println("Informe o valor em Celsius: ");
		Scanner scan = new Scanner(System.in);
		double c = scan.nextDouble(); 
		
		double f = c * 1.8 + 32 ;
		System.out.println("Valor em Fareinheit é "+f);
		
	}

}
