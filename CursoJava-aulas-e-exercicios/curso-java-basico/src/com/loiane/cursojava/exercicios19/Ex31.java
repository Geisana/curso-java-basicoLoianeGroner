package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20]; 
		int[] vetorB = new int[vetorA.length]; 
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("VA: Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		int posB = 0;

		for (int i = 0; i< vetorA.length ;i++){
			if (vetorA[i]%2 == 0 ) {
				vetorB[posB] = vetorA[i];
				posB++;
			} 
		}
		
		for (int i = 0; i< vetorA.length ;i++){
			if (vetorA[i]%2 != 0 ) {
				vetorB[posB] = vetorA[i];
				posB++;
			} 
		}
		
		System.out.print("VETOR B: ");
		for (int i = 0; i< posB ;i++){
			System.out.print(vetorB[i] +" ");
		
		}
	}

}
