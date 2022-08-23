package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		// Ano bissexto
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o ano: ");
		int ano = scan.nextInt();
		
		if ((ano % 4 ==0 ) || (ano % 400 == 0)) {
			
			System.out.println("Ano é bissexto. ");
		} else {
			System.out.println("Ano não é bissexto. ");
		}
		
	
	}

}
