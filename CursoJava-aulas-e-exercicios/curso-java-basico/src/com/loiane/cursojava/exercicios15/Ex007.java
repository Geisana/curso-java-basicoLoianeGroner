package com.loiane.cursojava.exercicios15;

import java.util.Scanner ;
public class Ex007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int n1 = scan.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		int n2 = scan.nextInt();
		System.out.println("Informe o terceiro n�mero: ");
		int n3 = scan.nextInt();
		
		if (n1 > n2 && n1> n3) {
			System.out.println("O "+n1+" � o maior n�mero. ");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O "+n2+" � o maior n�mero. ");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("O "+n3+" � o maior n�mero. ");
		}
		if (n1 < n2 && n1< n3) {
			System.out.println("O "+n1+" � o menor n�mero. ");
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("O "+n2+" � o menor n�mero. ");
		} else if (n3 < n1 && n3 < n2) {
			System.out.println("O "+n3+" � o menor n�mero. ");
		} else {
			System.out.println("N�meros iguais ");
			}

}
}