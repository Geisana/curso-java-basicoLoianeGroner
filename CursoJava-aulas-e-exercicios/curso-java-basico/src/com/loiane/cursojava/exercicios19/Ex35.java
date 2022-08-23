package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.print("Informe o "+ (i + 1) +" elemento: ");
			vetorA[i] = scan.nextInt();
		}

		
		for (int i = 0; i< vetorA.length ;i++){
			System.out.println("Analisando o número: "+ vetorA[i]);
			
			for (int j= 1; j< vetorA[i];j++) {
				if (vetorA[i] % j  == 0) {
					System.out.println(j+ " é divisor de "+ vetorA[i]);
					
				}
				
			}
			System.out.println("");
		}
		
	}

}
