package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10]; 
		int[] vetorB = new int[10]; 
		int[] vetorC = new int[20]; 
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("VA: Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
			vetorC[i] = vetorA[i];
		}
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("VB: Informe o "+ (i+1) +" elemento: ");
			vetorB[i] = scan.nextInt();
			vetorC[(vetorA.length + i)] = vetorB[i] ;	
		}
		
	/*	
		
		for (int i = 0; i< vetorA.length ;i++)
		{
			vetorC[i] = vetorA[i]; 		
		}
		
		
		for (int i = 0; i< vetorB.length ;i++)
		{
			vetorC[(vetorA.length + i)] = vetorB[i] ;			
		}
		
	*/
		
		for (int i = 0; i< vetorC.length ; i++)
		{
			System.out.print(vetorC[i] + " ");		
		}

	}

}
