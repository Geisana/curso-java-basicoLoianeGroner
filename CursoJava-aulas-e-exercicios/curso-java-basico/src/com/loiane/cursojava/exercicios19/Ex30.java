package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex30 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20]; 
		int[] vetorB = new int[vetorA.length]; 
		int[] vetorC = new int[vetorA.length]; 
		
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("VA: Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		int posB = 0;
		int posC = 0;
		
		for (int i = 0; i< vetorA.length ;i++){
			if (vetorA[i]%2 == 0 ) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		
		System.out.print("VETOR A: ");
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print(vetorA[i] +" ");
		
		}
		System.out.println(" ");
		
		System.out.print("VETOR B: ");
		for (int i = 0; i< posB ;i++){
			System.out.print(vetorB[i] +" ");
		
		}
		System.out.println(" ");
		
		System.out.print("VETOR C: ");
		for (int i = 0; i< posC; i++){
			System.out.print(vetorC[i] +" ");
		
		}
		System.out.println(" ");
		
	}

}
