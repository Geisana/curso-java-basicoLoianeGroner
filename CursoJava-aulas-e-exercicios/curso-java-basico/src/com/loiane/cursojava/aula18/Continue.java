package com.loiane.cursojava.aula18;
import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for (int i = num; i <= max; i++) {
			
			if( i%7 == 0) {
				continue; // se for multiplo de 7 "pula" mais interessante quando se trabalha com for aninhado
			}
			System.out.println(i);
		}

	}

}
