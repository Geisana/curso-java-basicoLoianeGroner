package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// B[i] = sqrt(A[i])
		
		Scanner scan = new Scanner(System.in);
		
		double [] vetorA = new double[3];
		double [] vetorB = new double[3];
		int i = 0 ;
		
		for (i = 0; i < 3 ; i++) {
			
			System.out.println("Informe o n�mero da posi��o [" + i + "]");
			vetorA[i] = scan.nextDouble();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
			
		}

		System.out.println("O valor do vetor B � ");
		for (i =0; i< vetorA.length; i++) {
			System.out.print("["+ vetorB[i]+ "]");
		}

	}

}
