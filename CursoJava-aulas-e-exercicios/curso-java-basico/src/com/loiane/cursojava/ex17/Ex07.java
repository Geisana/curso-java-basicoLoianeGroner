package com.loiane.cursojava.ex17;
import java.util.Scanner ;
public class Ex07 {

	public static void main(String[] args) {
		int maior = 0 ;
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0 ; i <5 ; i++) {
			System.out.print("Informe um número: ");
			numero = scan.nextInt();
			if (numero >= maior) {
				maior = numero ;
			}
		} 
		System.out.print("O maior número é "+ maior);
	}

}
