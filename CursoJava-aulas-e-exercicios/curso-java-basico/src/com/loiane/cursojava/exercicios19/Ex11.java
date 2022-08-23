package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[10];
	 
		System.out.println("VETOR A: ");  
		for(int i = 0 ; i < vetorA.length ; i++ ) {
			System.out.println("Informe o valor: ");
			vetorA[i] = scan.nextInt();
			
		}
		int qtd = 0;
		for(int i = 0 ; i < vetorA.length ; i++ ) {
			if (vetorA[i]%2 == 0){
				qtd ++;
			}			
			
		}
		
		
		for(int i = 0 ; i < vetorA.length ; i++ ) {
			System.out.print(vetorA[i] + " ");
			}
		
		System.out.println( " ");
		System.out.println("Quantidade de números pares "+ qtd);
		
	}

	

}
