package com.loiane.cursojava.ex17;

import java.util.Scanner ;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean valido = false ;
		int ano = 0;	
		double popA ;
		double popB;
		double taxA;
		double taxB;
		
		do {
			System.out.println("Popula��o A: ");
			popA = scan.nextDouble();
			if (popA > 0) {
				valido = true ;
			} else {
				System.out.println("Popula��o A n�o � valida.");
				
			}
						
		} while (!valido);
		
		
		do {
			System.out.println("Popula��o B: ");
			popB = scan.nextDouble();
			if (popB > 0) {
				valido = true ;
			} else {
				System.out.println("Popula��o B n�o � valida.");
				
			}
						
		} while (!valido);
		
		
		do {
			System.out.println("Taxa A: ");
			taxA = scan.nextDouble();
			if (taxA  > 0) {
				valido = true ;
			} else {
				System.out.println("Taxa da popula��o A n�o � valida.");
				
			}
						
		} while (!valido);
				
		
		do {
			System.out.println("Taxa B: ");
			taxB = scan.nextDouble();
			if (taxB  > 0) {
				valido = true ;
			} else {
				System.out.println("Taxa da popula��o B n�o � valida.");
				
			}
						
		} while (!valido);
		
		
		
		while (popA < popB) {	
			
			
			popA += (popA/100) * taxA ;
			popB += (popB/100) * taxB ;
			ano ++ ; 
			 
		} 
		System.out.println("Popula��o A: "+ popA);
		System.out.println("Popula��o B: "+ popB);
		System.out.println("Popula��o A � maior ou igual que popula��o B em "+ ano +" Anos");
		
	}

}
