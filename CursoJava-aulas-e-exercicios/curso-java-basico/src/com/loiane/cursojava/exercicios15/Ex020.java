package com.loiane.cursojava.exercicios15;
import java.util.Scanner;
public class Ex020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ponto  = 0 ;
		
		System.out.println("DIGITE 1 PARA SIM E 0 PARA NÃO");
		System.out.println("1. Telefonou para a vítima? ");
		int r1 = scan.nextInt();
		System.out.println("2. Esteve no local do crime? ");
		int r2 = scan.nextInt();
		System.out.println("3. Mora perto da vítima? ");
		int r3 = scan.nextInt();
		System.out.println("4. Devia para a vítima? ");
		int r4 = scan.nextInt();
		System.out.println("5. Já trabalhou com a vítima ");
		int r5 = scan.nextInt();
		System.out.println("5. Confessa o crime?  ");
		int r6 = scan.nextInt();
		
		ponto = r1 + r2 + r3 + r4 + r5;
		
		if (r5 == 1) {
			System.out.println("Réu confesso.");
		} else if (ponto == 2) {
			System.out.println("Suspeito.");
		} else if (ponto >= 3 && ponto <= 4) {
			System.out.println("Cúmplice.");
		} else if (ponto == 5) {
			System.out.println("Potencial assassino.");
		} else {
				System.out.println("Inocente.");
		}
	
	
	
	}

}
