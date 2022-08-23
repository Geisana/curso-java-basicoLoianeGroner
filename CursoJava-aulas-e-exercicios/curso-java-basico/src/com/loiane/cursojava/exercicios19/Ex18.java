package com.loiane.cursojava.exercicios19;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		
		
		for (int i = 0; i < 10 ; i++ ) 
		{
			System.out.println("Informe a idade: ");
			vetor[i] = scan.nextInt();
			
		}
			
		int menor  = vetor[0];
		int indexMenor = 0;
		int maior = vetor[0];
		int indexMaior = 0;
		for ( int i = 1 ; i <10 ; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i] ;
				indexMaior = i;
				
			} else if (vetor[i] < menor) {
				menor = vetor[i];
				indexMenor = i;
				
			}
			}
		
		
		System.out.println("I D A D E S : ");
		for ( int i = 0 ; i <10 ; i++) {
			System.out.print(vetor[i] + " ");
			}
			
		
		System.out.println("");
		System.out.println("A maior idade é " + maior);
		System.out.println("O menor idade é " + menor);

	}}
