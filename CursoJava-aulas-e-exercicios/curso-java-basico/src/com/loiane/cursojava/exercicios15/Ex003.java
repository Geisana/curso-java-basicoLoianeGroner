package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o seu gênero: ");
		System.out.println("[m] MASCULINO \n[f] FEMININO \n[t] TRANGENERO ");
		
		char genero = leitor.next().charAt(0); 
	
		switch (genero) {
		case 'm' : System.out.println("[M] MASCULINO ");break;
		case 'f' : System.out.println("[F] FEMININO ");break;
		case 't' : System.out.println("[T] TRANSGENERO ");break;
		default : System.out.println("Genêro não identificado");break;
		}
		
		
	}

}
