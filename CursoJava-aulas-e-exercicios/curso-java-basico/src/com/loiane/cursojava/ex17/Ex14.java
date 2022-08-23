package com.loiane.cursojava.ex17;
import java.util.Scanner ;
public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int par = 0;
		int impar = 0 ;
		 for (int i = 0 ; i < 10 ; i++) {
			 System.out.print("Número: ");
			 int n = scan.nextInt();
			 
			 if (n % 2 == 0) {
				 par += 1 ;
	
			 } else {
				 impar += 1 ;
			 }
			 
		 }
		 System.out.println ("Quantidade par : "+ par);
		 System.out.println ("Quantidade ímpar : "+ impar);
		

	}

}
