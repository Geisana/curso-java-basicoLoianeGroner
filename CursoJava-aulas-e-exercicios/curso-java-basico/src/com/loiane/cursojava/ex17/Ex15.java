package com.loiane.cursojava.ex17;

import java.util.Scanner ;
public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Infome o n-ésimo termo: ");
		int n = scan.nextInt();
		int proximo;
		int primeiro = 1 ;
		int segundo = 1 ;
		
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3 ; i <= n; i++) {
			proximo = primeiro + segundo ;
			primeiro = segundo;
			segundo = proximo ;
			System.out.println(proximo);
		}

} } 
