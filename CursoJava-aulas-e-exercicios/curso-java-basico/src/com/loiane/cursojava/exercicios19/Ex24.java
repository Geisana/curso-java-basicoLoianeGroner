package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex24 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i< vetor.length ;i++)
		{
			System.out.print("Informe o "+ (i+1) +" elemento: ");
			vetor[i] = scan.nextInt();
		}
		
		//teste palindromo
		boolean palindromo= true;
		for (int i = 0; i< (vetor.length/2) ;i++)
		{
			if (vetor[i] != vetor[vetor.length - 1 -i]) {
				palindromo = false;
				break;
				
			}
			
		}
		
		if (palindromo == true ) {
			System.out.println("Número é palindromo ");
		} else {
			System.out.println("Não é palindromo ");
		}
		

	}

}
