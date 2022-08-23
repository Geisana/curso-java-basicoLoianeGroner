package com.loiane.cursojava.aula16;

public class ComandoWhile {

	public static void main(String[] args) {
		int i = 1;  
		int max = 10;
		int c = 1;
		
		

		System.out.println("Contando até "+ max);
		while(i <= max) {
			System.out.println("Valor de i: "+ i);
			i++; // ou i = i+1 
		}
		
		System.out.println(i); // valor de 11
		
		do {
			c++ ;
			System.out.println("O valor de i: "+ c);
			
		} while (c <10);

	}

}
