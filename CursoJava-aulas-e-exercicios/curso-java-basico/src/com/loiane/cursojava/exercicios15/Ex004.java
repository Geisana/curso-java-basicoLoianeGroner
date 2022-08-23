package com.loiane.cursojava.exercicios15;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe uma letra do alfabeto ");
		String letra = leitor.next() ;
		
		if (letra.length () > 1){
			System.out.println("Não constitui letra");
		}
		else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||letra.equalsIgnoreCase("i")  ||letra.equalsIgnoreCase("o") ||letra.equalsIgnoreCase("u")  )
		{
			System.out.println("A letra "+letra+" é uma vogal.");
		} else {
			System.out.println("A letra "+letra+" é uma consoante.");
		}

	}

}
