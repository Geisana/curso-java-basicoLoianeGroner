package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os números a, b e c da equação do 2oGrau. No modelo [ ax^2 + bx + c ]");
		
		System.out.println("a = ");
		int a = scan.nextInt();
		System.out.println("b = ");
		int b = scan.nextInt();
		System.out.println("c = ");
		int c = scan.nextInt();
		
		double delta = ((Math.pow(b, 2)) - (4*a*c));

				
		if ( a == 0) {
			System.out.println("Não é uma equação do 2o Grau.");
		} else if ( delta < 0) {
			System.out.println("Não tem raízes reais.");
		} else if ( delta > 0) {
			double x = ((-b + Math.sqrt(delta)) / (2*a) );
			double x1 = ((-b - Math.sqrt(delta)) / (2*a) );
			System.out.println("x = "+ x + "\nx1 =  "+ x1);
		} 
		

	}

}
