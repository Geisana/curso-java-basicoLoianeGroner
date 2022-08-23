package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];		
		
		
		for (int i = 0; i< vetor.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" número: ");
			vetor[i] = scan.nextInt();
			if (vetor[i]%2 == 1) {
				break;
			}
		}
		
		
		for (int i = 0; i< vetor.length ;i++)
		{
			System.out.print(vetor[i]+ " ");
			
		}
	
	
	
	}

}
