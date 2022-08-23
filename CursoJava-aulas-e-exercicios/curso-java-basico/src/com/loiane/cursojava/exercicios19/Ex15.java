package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int percPar  = 0;
		int percImpar  = 0;
		
		int [] vetorA = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Informe o número: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				percPar ++;
				
			} else {
				percImpar ++;
			}
			
		}
		percPar  = percPar * 10;
		percImpar  = percImpar * 10;
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(vetorA[i] +" ");
		}
		System.out.println();
		System.out.println("A porcetagem de números pares é "+ percPar + "%");
		System.out.println("A porcetagem de números pares é "+ percImpar + "%");

	}

}
