package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("Informe o "+ (i + 1) +" elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i< vetorA.length ;i++){
			vetorB[i] = 1; 
			for(int j =1 ; j <= vetorA[i]; j++ ) {
				vetorB[i] *= j;
			}
		}
		
		System.out.println("Vetor A : ");
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print(vetorA[i]  +  " ");
		}
		System.out.println(" ");
		System.out.println("Vetor B : ");
		for (int i = 0; i< vetorB.length ;i++){
			System.out.print(vetorB[i]  +  " ");
		}

	}

}
