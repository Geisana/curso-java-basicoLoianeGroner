package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int qtd35 = 0;
		int[] vetor = new int[10];
	
		
		for (int i = 0; i <10 ;i++ ) {
			System.out.println("Informe o número: ");
			vetor[i] = scan.nextInt();
			
			// quantidade dos valores < 35
			if (vetor[i] > 35) {
				qtd35 ++;
			
			} 
		
		}
		
		System.out.println("VETOR: ");
		for (int i = 0 ; i <10 ; i++) {
			System.out.println(vetor[i] + " ");
		}
		
		System.out.println("");
		System.out.println("A QUANTIDADE DOS VALORES MAIORES QUE 35 = "+qtd35 );

	}
	}



