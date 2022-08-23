package com.loiane.cursojava.exercicios15;

import java.util.Scanner;
public class Ex014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Infome o valor das notas: ") ;
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = ((nota1 + nota2)/2);
		
		if (media >= 9 && media <= 10) {
			System.out.println("Notas: "+nota1+" e "+nota2) ;
			System.out.println("Média: "+media) ;
			System.out.println("Conceito: A") ;
		} else if (media < 9 && media >= 7.5){
			System.out.println("Notas: "+nota1+" e "+nota2) ;
			System.out.println("Média: "+media) ;
			System.out.println("Conceito: B") ;
		} else if (media >= 6 && media < 7.5){
			System.out.println("Notas: "+nota1+" e "+nota2) ;
			System.out.println("Média: "+media) ;
			System.out.println("Conceito: C") ;
		} else if (media < 6 && media > 4){
			System.out.println("Notas: "+nota1+" e "+nota2) ;
			System.out.println("Média: "+media) ;
			System.out.println("Conceito: D") ;
		} else if (media > 0  && media <= 4){
			System.out.println("Notas: "+nota1+" e "+nota2) ;
			System.out.println("Média: "+media) ;
			System.out.println("Conceito: E") ;
		}
		
		

	}

}
