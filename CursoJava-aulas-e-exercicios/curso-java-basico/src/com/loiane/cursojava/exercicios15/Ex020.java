package com.loiane.cursojava.exercicios15;
import java.util.Scanner;
public class Ex020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ponto  = 0 ;
		
		System.out.println("DIGITE 1 PARA SIM E 0 PARA N�O");
		System.out.println("1. Telefonou para a v�tima? ");
		int r1 = scan.nextInt();
		System.out.println("2. Esteve no local do crime? ");
		int r2 = scan.nextInt();
		System.out.println("3. Mora perto da v�tima? ");
		int r3 = scan.nextInt();
		System.out.println("4. Devia para a v�tima? ");
		int r4 = scan.nextInt();
		System.out.println("5. J� trabalhou com a v�tima ");
		int r5 = scan.nextInt();
		System.out.println("5. Confessa o crime?  ");
		int r6 = scan.nextInt();
		
		ponto = r1 + r2 + r3 + r4 + r5;
		
		if (r5 == 1) {
			System.out.println("R�u confesso.");
		} else if (ponto == 2) {
			System.out.println("Suspeito.");
		} else if (ponto >= 3 && ponto <= 4) {
			System.out.println("C�mplice.");
		} else if (ponto == 5) {
			System.out.println("Potencial assassino.");
		} else {
				System.out.println("Inocente.");
		}
	
	
	
	}

}
