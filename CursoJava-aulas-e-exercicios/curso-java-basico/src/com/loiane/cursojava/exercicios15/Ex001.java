package com.loiane.cursojava.exercicios15;

import java.util.Scanner;
public class Ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		int n1 = scan.nextInt();
		System.out.println("Informe outro numero inteiro: ");
		int n2 = scan.nextInt();
		if (n1>n2){
			System.out.println("O n�mero "+n1+" � maior que o n�mero "+n2);
		} else {
			System.out.println("O n�mero "+n2+" � maior que o n�mero "+n1);
		}
	}

}
