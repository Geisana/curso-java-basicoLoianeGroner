package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex26 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("VETOR A ");
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("VETOR B ");
		for (int i = 0; i< vetorB.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetorB[i] = scan.nextInt();
		}
		
		for (int i = 0; i< vetorC.length ;i++)
		{
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
		}
		
		for (int i = 0; i< vetorB.length ;i++)
		{
			System.out.print(vetorC[i] + " ");
		}
	}

}
