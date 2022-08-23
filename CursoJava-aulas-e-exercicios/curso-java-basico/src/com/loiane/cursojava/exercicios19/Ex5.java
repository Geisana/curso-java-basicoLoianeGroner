package com.loiane.cursojava.exercicios19;

public class Ex5 {

	public static void main(String[] args) {		
		
		// programa em escala menor ** Problema original com  10 elementos
		
		int i = 0; 
		int [] vetorA = new int[3];
		int [] vetorB = new int[3];
		
		vetorA[0] = 9;
		vetorA[1] = 8;
		vetorA[2] = 7;
		
		
		for (i= 0 ; i < 3 ; i++) {
			vetorB[i] = vetorA[i] * i; 
			
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
		
		

	}

}
