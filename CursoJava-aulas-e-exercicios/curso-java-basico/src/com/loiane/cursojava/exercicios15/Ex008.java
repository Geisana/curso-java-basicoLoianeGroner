package com.loiane.cursojava.exercicios15;

import java.util.Scanner;
public class Ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores dos produtos: ");
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		double valor3 = scan.nextDouble();
		
		if (valor1 <= valor2 && valor1 <= valor3) {
			System.out.println("Produto com valor mais barato: "+valor1);
		} else if (valor2 <= valor1 && valor2 <= valor3) {
			System.out.println("Produto com valor mais barato: "+valor2);
		} else if (valor3 <= valor1 && valor3 <= valor2) {
			System.out.println("Produto com valor mais barato: "+valor3);
		} else {
			System.out.println("Produto com valores iguais. ");
		}

	}

}
