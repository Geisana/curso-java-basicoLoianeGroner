package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex13 {

	public static void main(String[] args) {
		// soma dos valores 
		
		
		Scanner scan = new Scanner(System.in);
		int soma  = 0;
		int [] vetorA = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Informe o número: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
				
			}
			
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(vetorA[i] +" ");
		}
		
		System.out.println("Valor da soma dos números: "+ soma);
		
	

	}

}