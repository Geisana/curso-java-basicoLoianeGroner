package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex16 {

	public static void main(String[] args) {
		// soma dos valores < 15
		// quantidade de elementos = 15
		// media dos elementos armazenados no vetor que sao > 15
		
		Scanner scan = new Scanner(System.in);
		double media15 = 0;
		int div = 0;
		int soma15 = 0;
		int soma = 0;
		int qtd15 = 0;
		int[] vetor = new int[10];
		
		
		
		for (int i = 0; i <10 ;i++ ) {
			System.out.println("Informe o número: ");
			vetor[i] = scan.nextInt();
			
			// soma dos valores < 15
			if (vetor[i] < 15) {
				soma15 += vetor[i];
			
			// quantidade de elementos = 15	
			} else if (vetor[i] == 15){
				qtd15 ++; 
				
			// media dos elementos armazenados no vetor que sao > 15
			} else if (vetor[i] > 15) {
				div ++; 
				soma += vetor[i];
			
			}
			
		}
		
		media15 = soma / div;
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(vetor[i] +" ");
		}
		
		
		System.out.println("");
		System.out.println("Soma dos valores menores que 15 = " + soma15);
		System.out.println("Quantidade dos valores iguais a 15 = " + qtd15);
		System.out.println("Media dos valores maiores que 15 = " + media15);
		
	}

}
