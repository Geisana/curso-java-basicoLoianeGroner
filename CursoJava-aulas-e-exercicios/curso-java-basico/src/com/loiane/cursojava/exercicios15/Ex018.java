package com.loiane.cursojava.exercicios15;
import java.util.Scanner; ;
public class Ex018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Informe um número inteiro: ");
		int n = scan.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Numero é par. ");
		} else {
			System.out.println("Numero não é par. ");
		}
		
	}

}
