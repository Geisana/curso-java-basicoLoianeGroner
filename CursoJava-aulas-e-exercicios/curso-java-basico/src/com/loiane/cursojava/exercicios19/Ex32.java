package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5]; 
		
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.println("Tabuada de "+vetorA[i] );
			for (int j = 0; j<= 10 ;j++){
				System.out.println(j + " x " +vetorA[i] +" = "+(vetorA[i] * j));
				
			}
			System.out.println();
		}

	}

}
