package com.loiane.cursojava.exercicios19;

import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		// B[i] = A[i] * A[i]
		
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[15];
		int [] vetorB = new int[15];
		int i = 0;
		
		for (i = 0 ; i<vetorA.length ; i++) {
			System.out.println("Informe um número: ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
			
		}
		
		System.out.println("O valor do vetor B é ");
		for (i =0; i< vetorA.length; i++) {
			System.out.print(vetorB[i]+" ");
		}

	}

}
