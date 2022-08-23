package com.loiane.cursojava.exercicios19;

public class Ex7 {

	public static void main(String[] args) {
		int [] vetorA = new int[10];
		int [] vetorB = new int[10];
		int [] vetorC= new int[10];
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
		
		vetorB[1] = 1;
		vetorB[2] = 3;
		vetorB[3] = 4;
		vetorB[4] = 5;
		vetorB[5] = 6;
		vetorB[6] = 7;
		vetorB[7] = 8;
		vetorB[8] = 9;
		vetorB[9] = 20;
		vetorB[0] = 1;
		
		for(i = 0 ; i < 10 ; i++ ) {
			
			System.out.print("[" + vetorB[i] +"]"); 
		}
		
		System.out.println(""); 
		System.out.println("O vetor c é ");


		for(i = 0 ; i < 10 ; i++ ) {
			
			vetorC[i] = vetorA[i] - vetorB[i]; 
		}
		
		for(i = 0 ; i < 10 ; i++ ) {
			
			System.out.print("[" + vetorC[i] +"]"); 
		}
		
	}

}
