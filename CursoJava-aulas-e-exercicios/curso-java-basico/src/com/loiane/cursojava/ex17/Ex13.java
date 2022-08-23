package com.loiane.cursojava.ex17;
import java.util.Scanner ;
public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a base: ");
		int base = scan.nextInt();
		System.out.print("Informe o expoente: ");
		int expo = scan.nextInt();
		int resposta = 1;
		
	
		for (int i = 0 ; i < expo ; i++) {
			resposta = resposta * base  ;
		}
		System.out.print("Resposta "+ resposta);

	}

}
