package com.loiane.cursojava.exercicios15;

import java.util.Scanner ;
public class Ex007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.println("Informe o segundo número: ");
		int n2 = scan.nextInt();
		System.out.println("Informe o terceiro número: ");
		int n3 = scan.nextInt();
		
		if (n1 > n2 && n1> n3) {
			System.out.println("O "+n1+" é o maior número. ");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O "+n2+" é o maior número. ");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("O "+n3+" é o maior número. ");
		}
		if (n1 < n2 && n1< n3) {
			System.out.println("O "+n1+" é o menor número. ");
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("O "+n2+" é o menor número. ");
		} else if (n3 < n1 && n3 < n2) {
			System.out.println("O "+n3+" é o menor número. ");
		} else {
			System.out.println("Números iguais ");
			}

}
}