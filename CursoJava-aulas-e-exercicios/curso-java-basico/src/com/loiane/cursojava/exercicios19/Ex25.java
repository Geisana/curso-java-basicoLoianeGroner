package com.loiane.cursojava.exercicios19;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i]%2 ==0) {
				vetorB[i] = 1;
				
			} else {
				vetorB[i] = 0;
			}
		}
		
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print(vetorB[i] + " ");
		}

	}

}
