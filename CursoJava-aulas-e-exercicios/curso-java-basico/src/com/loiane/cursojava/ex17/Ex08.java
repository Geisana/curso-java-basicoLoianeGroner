package com.loiane.cursojava.ex17;
import java.util.Scanner ;
public class Ex08 {

	public static void main(String[] args) {
		double media = 0 ;
		int numero = 0;
		int soma = 0 ;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0 ; i <5 ; i++) {
			System.out.print("Informe um número: ");
			numero = scan.nextInt();
			soma += numero ;
			media = soma/ 5;
			
		} 
		System.out.println("A soma dos números é "+ soma);
		System.out.println("A media dos números é "+ media);
	}

}