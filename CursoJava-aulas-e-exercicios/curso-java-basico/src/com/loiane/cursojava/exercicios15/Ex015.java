package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor dos lados do Triângulo: ");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if ((lado1+ lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
			System.out.println("Os lados formam um triangulo!");
		} if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo equilátero");
		} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			System.out.println("Triângulo isoceles");
		} else {
			System.out.println("Triângulo escaleno");
		}
		
		
	
	}

}
