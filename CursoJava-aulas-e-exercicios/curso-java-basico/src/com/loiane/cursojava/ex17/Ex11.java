package com.loiane.cursojava.ex17;

import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0 ;
		
		System.out.println("Informe o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		int n2 = scan.nextInt();
		
		soma  = n1 + n2 ;
		if (n2 > n1) {
			for (int i = n1 ; i < n2 ; i++) {
				System.out.print(i + " ");
				
				
				} } else if (n1 > n2){
						for (int i = n1 ; i > n2 ; i--) {
							System.out.print(i +" ");
							
							}
					}
		System.out.println();
		System.out.println("A soma dos numeros é " + soma);
		
	
	}}