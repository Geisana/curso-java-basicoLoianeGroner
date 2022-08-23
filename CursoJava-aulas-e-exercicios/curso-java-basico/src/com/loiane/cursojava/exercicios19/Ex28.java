package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex28 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10]; 
		int[] vetorB = new int[10]; 
		
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i< vetorA.length ;i++)
		{
			vetorB[(vetorA.length-1 -i)] = vetorA[i] ; 		
		}
		
		System.out.print("Vetor B: ");
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print(vetorB[i] + " ");			
		}

	}

}
