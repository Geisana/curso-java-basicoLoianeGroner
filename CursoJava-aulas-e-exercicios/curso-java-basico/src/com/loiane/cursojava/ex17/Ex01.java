package com.loiane.cursojava.ex17;
import java.util.Scanner;

public class Ex01 {

	
	public static void main(String[] args) {
		
		/*
		int i = 0 ;
		Scanner scan = new Scanner(System.in);
		 double nota = 0 ;
		
		do {
			System.out.println("Informe a nota: ");
			nota  = scan.nextDouble();	
			
			if (nota > 10 || nota < 0) {
				System.out.println("Nota inválida");
				} else {
					System.out.println("Nota válida.");
				}
			i++;
			
		} while (nota > 10 || nota < 0);
		System.out.println("Nota: " + nota);
		
		*/
		
		//Uso de Flags - Outra maneira de fazer
		
		
		boolean notaValida = false;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entre com uma nota: ");
			double nota = scan.nextDouble();
			if (nota>= 0 && nota <= 10) {
				
				notaValida = true; // mudança de flag
				
				System.out.println("Nota válida");
			} else {
				System.out.println("Nota inválida");
			}
		} while (!notaValida);
		}

	}	

