package com.loiane.cursojava.exercicios;
import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeira nota:  ");
		
		double n1 = scan.nextInt();
		
		System.out.println("Informe segunda nota:  ");
		double n2 = scan.nextInt();
		
		System.out.println("Informe terceira nota:  ");
		double n3 = scan.nextInt();
		
		System.out.println("Informe quarta nota:  ");
		double n4 = scan.nextInt();
		
		double media = (n1+n2+n3+n4)/4 ;
		
		System.out.println("A média das notas é " + media);
		
		
		
	}

}
