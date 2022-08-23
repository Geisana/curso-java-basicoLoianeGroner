package com.loiane.cursojava.exercicios15;


import java.util.Scanner;
public class EX021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Qual combustível que deseja abastecer: \n- Gasolina \n- Álcool");
		String combustivel = scan.next();
		System.out.println("Quantos litros deseja abastecer? ");
		double litro = scan.nextInt();
		double g = 2.5* litro ;
		double a = 1.9* litro;
		
		
		System.out.println("Tipo de combustível : "+combustivel);
		System.out.println("Numero de litros vendidos: "+litro+"L");
		
		
		

	
	
	}

}
