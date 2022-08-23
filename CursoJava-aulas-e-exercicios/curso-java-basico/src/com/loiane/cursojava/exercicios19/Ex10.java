package com.loiane.cursojava.exercicios19;

public class Ex10 {

	public static void main(String[] args) {
		double [] vetorA = new double[10];
		double [] vetorB = new double[10];
		int i = 0 ;
		
		vetorA[1] = 12;
		vetorA[2] = 13;
		vetorA[3] = 14;
		vetorA[4] = 15;
		vetorA[5] = 16;
		vetorA[6] = 17;
		vetorA[7] = 18;
		vetorA[8] = 19;
		vetorA[9] = 20;
		vetorA[0] = 11;
		 
		for(i = 0 ; i < 10 ; i++ ) {
			
			System.out.print("[" + vetorA[i] +"]"); 
		}
		System.out.println(""); 

		System.out.println("Resto da divisão do vetor A por 2"); 
		
		for(i = 0 ; i < 10 ; i++ ) {
			
			vetorB[i] = vetorA[i] % 2 ;
		}
		
		
		for(i = 0 ; i < 10 ; i++ ) {
			
			System.out.print("[" + vetorB[i] +"]"); 
		}
		
	}


	}


