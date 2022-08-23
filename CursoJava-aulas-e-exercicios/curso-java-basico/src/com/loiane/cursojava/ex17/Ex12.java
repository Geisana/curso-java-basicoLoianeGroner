package com.loiane.cursojava.ex17;

import java.util.Scanner ;
public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 10: ");
		int tabuada = scan.nextInt();
		System.out.println("Tabuada de "+tabuada );
		for (int i = 1 ; i <= 10 ; i++) {
			
			System.out.println(i + " x " + tabuada + " = " + (i * tabuada));
		}
		

	}

}
