package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor dos lados do Tri�ngulo: ");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if ((lado1+ lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
			System.out.println("Os lados formam um triangulo!");
		} if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Tri�ngulo equil�tero");
		} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			System.out.println("Tri�ngulo isoceles");
		} else {
			System.out.println("Tri�ngulo escaleno");
		}
		
		
	
	}

}
