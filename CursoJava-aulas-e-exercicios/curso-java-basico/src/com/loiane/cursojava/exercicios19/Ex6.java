package com.loiane.cursojava.exercicios19;

public class Ex6 {

	public static void main(String[] args) {
		
		
		// programa em escala menor ** Problema original com  10 elementos
		
		int i = 0; 
		int [] vetorA = new int[3];
		int [] vetorB = new int[3];
		int [] vetorC = new int[3];
		
		vetorA[0] = 9;
		vetorA[1] = 8;
		vetorA[2] = 7;
		
		vetorB[0] = 1;
		vetorB[1] = 2;
		vetorB[2] = 3;
		
		
		for (i= 0 ; i < 3 ; i++) {
			vetorC[i] = vetorA[i] + vetorB[i]; 
			
		}
		
		System.out.print("O vetor A é ");
		for (i = 0; i < 3 ; i++) {
			
			System.out.print("["+ vetorA[i] + "] ");
		}
		System.out.println("");
		
		System.out.print("O vetor B é ");
		for (i = 0; i < 3 ; i++) {
			
			System.out.print("["+ vetorB[i] + "] ");
		}
		
		System.out.println("");
		
		System.out.print("O vetor C é ");
		for (i = 0; i < 3 ; i++) {
			
			System.out.print("["+ vetorC[i] + "] ");
		}
		
		

	}

}
