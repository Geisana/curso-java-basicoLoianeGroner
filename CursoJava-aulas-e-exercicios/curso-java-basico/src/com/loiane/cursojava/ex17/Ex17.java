package com.loiane.cursojava.ex17;
import java.util.Scanner ;
public class Ex17 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o número: ");
		int n = scan.nextInt();
		int fatorial = 1 ;
		for (int i = n ; i != 0; i--) {
			fatorial *= i ;
			System.out.println(i);

		}
		System.out.println("O falorial do número é " + fatorial);

	}

}
