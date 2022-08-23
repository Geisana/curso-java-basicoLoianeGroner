package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i ;
		int num ;
		int [] vetorA = new int[5];
		int [] vetorB = new int[vetorA.length];
		vetorA[0] = 3;
		vetorA[1] = 2;
		vetorA[2] = 1;
		vetorA[3] = 0;
		vetorA[4] = 7;

		for (i =0; i< vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
			
		}
		
		System.out.println();
		for ( i =0; i< vetorA.length; i++) {
			vetorB[i] = vetorA[i];
			System.out.print(vetorB[i]+" ");
			
		}
		
		

	}

}
