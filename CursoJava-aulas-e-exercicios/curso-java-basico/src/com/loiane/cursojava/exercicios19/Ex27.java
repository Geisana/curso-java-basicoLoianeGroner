package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10]; 
		char[] vetorB = new char[10]; 
		
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetorA[i] = scan.nextInt();
			//menor
			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			//igual
			}else if(vetorA[i] == 7 ) {
				vetorB[i] = 'b';
			//entre
			}else if(vetorA[i] > 7 && vetorA[i] <10) {
				vetorB[i] = 'c';
			//igual
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else if(vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
		}
		
		
		System.out.print("Vetor B: ");
		for (int i = 0; i< vetorA.length ;i++)
		{
			System.out.print(vetorB[i] + " ");			
		}
		

	}

}
