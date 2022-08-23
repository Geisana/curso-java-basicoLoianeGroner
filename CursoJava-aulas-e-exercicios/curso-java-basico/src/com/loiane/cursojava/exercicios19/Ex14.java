package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soma  = 0;
		int [] vetorA = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Informe o número: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 1) {
				soma += vetorA[i];
				
			}
			
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(vetorA[i] +" ");
		}
		
		System.out.println("Valor da soma dos números pares é: "+ soma);
		

	}

}
