package com.loiane.cursojava.ex17;

import java.util.Scanner ;
public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int n = scan.nextInt();
		boolean primo = true ;
		
		
		for (int i = 2 ; i < n ; i++) {
			if (n % i == 0) {
				System.out.println("O número "+n +" não é primo - Divisivel por "+i);
				primo = false ;
			}
		}
		
		
		if (primo) {
			System.out.println("O número "+ n +" é primo.");
			
		}

	}

}
