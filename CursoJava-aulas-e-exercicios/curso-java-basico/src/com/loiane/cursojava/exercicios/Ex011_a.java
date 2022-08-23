package com.loiane.cursojava.exercicios;

import java.util.Scanner ;
public class Ex011_a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número: ");
		int n1 = scan.nextInt();

		System.out.println("Informe segundo número: ");
		int n2 = scan.nextInt();
		
		System.out.println("Informe terceiro número: ");
		double n3 = scan.nextInt();
		
		double letraA = ((n1*2)*(n2/2));
		double letraB = ((n1*3) + n3);
		double letraC = Math.pow(n3, 3) ;
		
		System.out.println("Letra A: "+letraA);
		System.out.println("Letra B: "+letraB);
		System.out.println("Letra C: "+letraC);
		
	}

}
