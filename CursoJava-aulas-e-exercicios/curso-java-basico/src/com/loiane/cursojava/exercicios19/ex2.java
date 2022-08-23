package com.loiane.cursojava.exercicios19;

import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[8];
		int [] vetorB = new int[vetorA.length];
		
		for (int i =0; i< vetorA.length; i++) {
			System.out.print("Informe um número: ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = (vetorA[i])*2;
				
		}
		System.out.println("O valor do vetor A é ");
		
		for (int i =0; i< vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		
		}
		System.out.println("");
		System.out.println("O valor do vetorB é ");
		for (int i =0; i< vetorA.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		

	}

}
